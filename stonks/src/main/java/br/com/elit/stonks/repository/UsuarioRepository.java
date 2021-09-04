package br.com.elit.stonks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.elit.stonks.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

	@Query("SELECT user FROM UsuarioModel user WHERE (user.nome like concat ('%', ?1, '%')) OR ?1 IS NULL AND (user.email like concat ('%', ?2, '%')) OR ?2 IS NULL")
	List<UsuarioModel> getAllFilter(String name, String email);
		
	
}
