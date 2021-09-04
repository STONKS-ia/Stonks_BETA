package br.com.elit.stonks.controller;

import br.com.elit.stonks.model.ArquivoModel;
import br.com.elit.stonks.model.ArquivoModel;
import br.com.elit.stonks.repository.ArquivoRepository;
import br.com.elit.stonks.repository.MunicipioRepository;
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
@RequestMapping("/arquivo")
public class ArquivoController {

	@Autowired
	ArquivoRepository arquivoRep;

	@GetMapping()
	public ResponseEntity<List<ArquivoModel>> getAll(){
		List<ArquivoModel> arquivos = arquivoRep.findAll();

		return ResponseEntity.ok(arquivos);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ArquivoModel> findById(@PathVariable("id") int id, Model model) {

		ArquivoModel arquivo = arquivoRep.findById(id).get();

		return ResponseEntity.ok(arquivo);
	}

	@PostMapping()
	public ResponseEntity save(@RequestBody @Valid ArquivoModel arquivo, @RequestParam BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		arquivo = arquivoRep.save(arquivo);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(arquivo.getIdArquivo()).toUri();

		return ResponseEntity.created(location).build();
	}


	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable("id") int id, @RequestBody @Valid ArquivoModel arquivo, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}

		arquivo.setIdArquivo(id);
		arquivoRep.save(arquivo);

		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable("id") int id) {

		arquivoRep.deleteById(id);

		return ResponseEntity.noContent().build();
	}

}
