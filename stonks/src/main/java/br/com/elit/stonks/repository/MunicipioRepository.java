package br.com.elit.stonks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.elit.stonks.model.MunicipioModel;

public interface MunicipioRepository extends JpaRepository<MunicipioModel, Integer> {

}
