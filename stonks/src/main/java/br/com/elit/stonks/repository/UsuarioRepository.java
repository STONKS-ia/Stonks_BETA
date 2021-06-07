package br.com.elit.stonks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.elit.stonks.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

	
	//@Query("SELECT USUARIOS.SENHA  FROM USUARIOS USUARIOS WHERE USUARIOS.EMAIL = ?;")
	//List<UsuarioModel> findByName(@Param("email") String email);
		
	
}
