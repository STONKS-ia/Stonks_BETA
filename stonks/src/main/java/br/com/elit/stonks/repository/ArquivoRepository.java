
package br.com.elit.stonks.repository;

import br.com.elit.stonks.model.ArquivoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArquivoRepository extends JpaRepository<ArquivoModel, Integer> {

    @Query("SELECT file FROM ArquivoModel file " +
            "WHERE (file.nomeArquivo like concat ('%', ?1, '%') OR ?1 IS NULL) " +
            "And (file.municipio.nomeMunicipio like concat('%', ?2, '%') OR ?2 IS NULL)")
    List<ArquivoModel> getAllFilter(String name, String nomeMunicipio);

}