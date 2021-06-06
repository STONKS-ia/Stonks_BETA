package br.com.stonks.controller;

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

import br.com.stonks.model.UsuarioModel;
import br.com.stonks.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	private static final String USUARIO_FOLDER = "usuario/";
	
	@Autowired
	UsuarioRepository usuarioRep;
	
	
	@GetMapping("/form")
	public String openForm(@RequestParam String page, 
			@RequestParam(required= false) int id, 
			@ModelAttribute("usuarioModel")  UsuarioModel usuarioModel,
			Model model) {
		
		if ("usuario-editar".equals(page)) {
			
			model.addAttribute("usuarioModel", usuarioRep.findById(id).get());
		}
		return USUARIO_FOLDER + page;
	}
	
	@GetMapping
	public String getAll(Model model) {
		
		model.addAttribute("usuarios", usuarioRep.findAll());
		
		return USUARIO_FOLDER + "usuarios";
		
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		
		model.addAttribute("usuario", usuarioRep.findById(id).get());
		
		return USUARIO_FOLDER + "usuario-detalhe";
	}
	
	
	@PostMapping
	public String save( UsuarioModel usuarioModel,  RedirectAttributes redirectAttributes){
	
		usuarioRep.save(usuarioModel);
		redirectAttributes.addFlashAttribute("messages", "Usuario cadastrado com sucesso");
		
		
		return "redirect:/usuario";
	} 
	
	
	@PutMapping("/{id}")
	public String update(@PathVariable("id") int id, UsuarioModel usuarioModel, RedirectAttributes redirectAttributes) {
		
		usuarioModel.setIdUsuario(id);
		usuarioRep.save(usuarioModel);
		redirectAttributes.addFlashAttribute("messages", "Usuario alterado com sucesso");
		
		
		return "redirect:/usuario";
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		
		usuarioRep.deleteById(id);
		redirectAttributes.addFlashAttribute("messages", "usuario excluido com sucesso!");

		return "redirect:/usuario";
	}
	
}
