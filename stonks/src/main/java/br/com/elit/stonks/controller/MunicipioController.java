package br.com.elit.stonks.controller;

import javax.validation.Valid;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import br.com.elit.stonks.model.MunicipioModel;
import br.com.elit.stonks.repository.MunicipioRepository;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/municipio")
public class MunicipioController {
	
	@Autowired
	MunicipioRepository municipioRep;

	@GetMapping()
	public ResponseEntity<List<MunicipioModel>> getAll(){
		List<MunicipioModel> municipio = municipioRep.findAll();

		return ResponseEntity.ok(municipio);
	}

	@GetMapping("/{id}")
	public ResponseEntity<MunicipioModel> findById(@PathVariable("id") int id, Model model) {

		MunicipioModel municipioModel =  municipioRep.findById(id).get();

		return ResponseEntity.ok(municipioModel);
	}


	@PostMapping()
	public ResponseEntity save(@RequestBody @Valid MunicipioModel municipioModel, @RequestParam BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		 municipioModel=  municipioRep.save(municipioModel);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(municipioModel.getIdMunicipio()).toUri();
		
		return ResponseEntity.created(location).build();
	} 
	
	
	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable("id") int id, @RequestBody @Valid MunicipioModel municipioModel, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		
		municipioModel.setIdMunicipio(id);
		municipioRep.save(municipioModel);

		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") int id) {
		
		municipioRep.deleteById(id);

		return ResponseEntity.noContent().build();
	}
	
}
