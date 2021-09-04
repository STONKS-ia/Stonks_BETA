package br.com.elit.stonks.controller;

import javax.validation.Valid;

import br.com.elit.stonks.model.MunicipioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import br.com.elit.stonks.model.UsuarioModel;
import br.com.elit.stonks.repository.UsuarioRepository;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRep;

	@GetMapping("/{id}")
	public ResponseEntity<UsuarioModel> findById(@PathVariable("id") Integer id, Model model) {
		UsuarioModel usuarioModel = usuarioRep.findById(id).get();
		return ResponseEntity.ok(usuarioModel);
	}
	@GetMapping("/list")
	public ResponseEntity<List<UsuarioModel>> findById(@RequestParam String name, @RequestParam String email) {
		List<UsuarioModel> usuarioModel = usuarioRep.getAllFilter(name, email);
		return ResponseEntity.ok(usuarioModel);
	}

	@PostMapping
	public ResponseEntity save(@RequestBody @Valid UsuarioModel usuarioModel, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return ResponseEntity.badRequest().build();
		}
		usuarioModel = usuarioRep.save(usuarioModel);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(usuarioModel.getIdUsuario()).toUri();

		return ResponseEntity.created(location).build();
	}


	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable("id") Integer id, @RequestBody @Valid UsuarioModel usuarioModel, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}

		usuarioModel.setIdUsuario(id);
		usuarioRep.save(usuarioModel);

		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") int id) {

		usuarioRep.deleteById(id);

		return ResponseEntity.noContent().build();
	}
	
	
}
