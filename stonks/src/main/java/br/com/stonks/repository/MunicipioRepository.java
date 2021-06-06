package br.com.stonks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stonks.model.MunicipioModel;

public interface MunicipioRepository extends JpaRepository<MunicipioModel, Integer> {

}
