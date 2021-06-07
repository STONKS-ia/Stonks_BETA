package br.com.elit.stonks.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.elit.stonks.model.MunicipioModel;
import br.com.elit.stonks.repository.MunicipioRepository;

@Controller
@RequestMapping("/municipio")
public class MunicipioController {

	private static final String MUNICIPIO_FOLDER = "municipio/";
	
	@Autowired
	MunicipioRepository municipioRep;
	
	
	@GetMapping("/form")
	public String openForm(@RequestParam String page, 
			@RequestParam(required= false) Integer id, 
			@ModelAttribute("municipioModel")  MunicipioModel municipioModel,
			Model model) {
		
		if ("atualizarMunicipio".equals(page)) {
			
			model.addAttribute("municipioModel", municipioRep.findById(id).get());
		}
		return MUNICIPIO_FOLDER + page;
	}
	
	@GetMapping
	public String getAll(Model model) {
		
		model.addAttribute("municipios", municipioRep.findAll());
		
		return MUNICIPIO_FOLDER + "municipios";
		
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		
		model.addAttribute("municipio", municipioRep.findById(id).get());
		
		return MUNICIPIO_FOLDER + "municipio-detalhe";
	}
	
	
	@PostMapping
	public String save(MunicipioModel municipioModel,  BindingResult bindingResult, RedirectAttributes redirectAttributes){
	
		municipioRep.save(municipioModel);
		redirectAttributes.addFlashAttribute("messages", "Municipio cadastrado com sucesso");		
		
		return "redirect:/municipio";
	} 
	
	
	@PutMapping("/{id}")
	public String update(@PathVariable("id") int id, @Valid MunicipioModel municipioModel, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
		
		municipioModel.setIdMunicipio(id);
		municipioRep.save(municipioModel);
		redirectAttributes.addFlashAttribute("messages", "Municipio alterado com sucesso");
		
		
		return "redirect:/municipio";
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		
		municipioRep.deleteById(id);
		redirectAttributes.addFlashAttribute("messages", "usuario excluido com sucesso!");

		return "redirect:/municipio";
	}
	
}
