package br.com.elit.stonks.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="MUNICIPIOS")
public class MunicipioModel {

	private int idMunicipio;
	private String nomeMunicipio;
	private String urlPortal;
	
	private List<UsuarioModel> usuarios;
	
	public MunicipioModel(int idMunicipio, String nomeMunicipio, String urlPortal) {
		super();
		this.idMunicipio = idMunicipio;
		this.nomeMunicipio = nomeMunicipio;
		this.urlPortal = urlPortal;
	}
	
	public MunicipioModel() {
		
	}


	@Id
	@Column(name="ID_MUNICIPIO")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="MUNICIPIOS_SEQ")
	@SequenceGenerator(name = "MUNICIPIOS_SEQ", sequenceName="MUNICIPIOS_SEQ", allocationSize = 1)
	public int getIdMunicipio() {
		return idMunicipio;
	}



	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}


	@Column(name="NOME_MUNICIPIO")
	@Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 50 caracteres")
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}



	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}


	@Column(name="URL_PORTAL")
	@Size(min = 2, max = 50, message = "URL deve ser entre 2 e 50 caracteres")
	public String getUrlPortal() {
		return urlPortal;
	}



	public void setUrlPortal(String urlPortal) {
		this.urlPortal = urlPortal;
	}
	
	@OneToMany(mappedBy = "municipio")
	public List<UsuarioModel> getUsuarios(){
		return usuarios;
	}
	
	public void setUsuarios(List<UsuarioModel> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
