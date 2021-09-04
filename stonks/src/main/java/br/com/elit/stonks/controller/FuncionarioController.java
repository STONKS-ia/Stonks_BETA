package br.com.elit.stonks.controller;

import br.com.elit.stonks.model.ArquivoModel;
import br.com.elit.stonks.model.FuncionarioModel;
import br.com.elit.stonks.repository.ArquivoRepository;
import br.com.elit.stonks.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioRepository funcionarioRep;

	@GetMapping()
	public ResponseEntity<List<FuncionarioModel>> getAll(){
		List<FuncionarioModel> funcionarios = funcionarioRep.findAll();

		return ResponseEntity.ok(funcionarios);
	}

	@GetMapping("/{id}")
	public ResponseEntity<FuncionarioModel> findById(@PathVariable("id") int id, Model model) {

		FuncionarioModel funcionario = funcionarioRep.findById(id).get();

		return ResponseEntity.ok(funcionario);
	}

	@PostMapping()
	public ResponseEntity save(@RequestBody @Valid FuncionarioModel funcionario, @RequestParam BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		funcionario = funcionarioRep.save(funcionario);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(funcionario.getIdFuncionario()).toUri();

		return ResponseEntity.created(location).build();
	}


	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable("id") int id, @RequestBody @Valid FuncionarioModel arquivo, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}

		arquivo.setIdFuncionario(id);
		funcionarioRep.save(arquivo);

		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") int id) {

		funcionarioRep.deleteById(id);

		return ResponseEntity.noContent().build();
	}

}
