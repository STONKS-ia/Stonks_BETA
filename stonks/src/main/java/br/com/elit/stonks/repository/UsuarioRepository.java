package br.com.elit.stonks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.elit.stonks.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

	
	
}
