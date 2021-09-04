package br.com.elit.stonks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.elit.stonks.model.MunicipioModel;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MunicipioRepository extends JpaRepository<MunicipioModel, Integer> {

    @Query(value = "SELECT municipio FROM MunicipioModel municipio WHERE (municipio.nomeMunicipio like concat ('%', ?1, '%')) OR ?1 IS NULL ")
    List<MunicipioModel> getAllFilter(String name);
}
