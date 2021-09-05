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
	@GetMapping("/list")
	public ResponseEntity<List<FuncionarioModel>> findById(@RequestParam String name, @RequestParam String cpf,@RequestParam String cargo) {
		if(name.isEmpty())
			name = "";
		if(cpf.isEmpty())
			cpf = "";
		if(cargo.isEmpty())
			cargo = "";
		List<FuncionarioModel> funcionario = funcionarioRep.getAllFilter(name,cpf,cargo);
		return ResponseEntity.ok(funcionario);
	}

	@PostMapping()
	public ResponseEntity save(@RequestBody @Valid FuncionarioModel funcionario, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		funcionario = funcionarioRep.save(funcionario);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(funcionario.getIdFuncionario()).toUri();

		return ResponseEntity.created(location).header("Criado").body("Funcionario Criado");
	}


	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable("id") int id, @RequestBody @Valid FuncionarioModel funcionario, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}

		funcionario.setIdFuncionario(id);
		funcionarioRep.save(funcionario);

		return ResponseEntity.ok().header("Atualizado").body("Funcionario Atualizado");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") int id) {

		funcionarioRep.deleteById(id);

		return ResponseEntity.ok().header("Deletado").body("Funcionario Deletado");
	}

}
