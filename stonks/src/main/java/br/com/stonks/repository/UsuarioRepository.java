package br.com.stonks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stonks.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

	
	
}
