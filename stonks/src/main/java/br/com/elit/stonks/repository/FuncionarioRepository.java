package br.com.elit.stonks.repository;

import br.com.elit.stonks.model.ArquivoModel;
import br.com.elit.stonks.model.FuncionarioModel;
import br.com.elit.stonks.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {

    @Query("SELECT funcionario FROM FuncionarioModel funcionario " +
            "WHERE (funcionario.nomeCompleto like concat ('%', ?1, '%') OR ?1 IS NULL) "+
            "AND (funcionario.cpf like concat ('%', ?2, '%') OR ?3 IS NULL) " +
            "AND (funcionario.cargo like concat ('%', ?3, '%') OR ?3 IS NULL) ")
    List<FuncionarioModel> getAllFilter(String nomeCompleto, String cpf, String cargo);

}
