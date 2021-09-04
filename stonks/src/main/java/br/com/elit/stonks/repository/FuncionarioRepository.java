package br.com.elit.stonks.repository;

import br.com.elit.stonks.model.ArquivoModel;
import br.com.elit.stonks.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {

}
