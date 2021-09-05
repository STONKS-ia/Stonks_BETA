
package br.com.elit.stonks.repository;

import br.com.elit.stonks.model.ArquivoModel;
import br.com.elit.stonks.model.MunicipioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArquivoRepository extends JpaRepository<ArquivoModel, Integer> {

}