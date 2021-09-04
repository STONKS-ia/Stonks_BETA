package br.com.elit.stonks.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name="MUNICIPIOS")
public class MunicipioModel {

	private int idMunicipio;
	private String nomeMunicipio;
	private String urlPortal;
	private List<ArquivoModel> arquivos = new ArrayList();
	
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
	@Size(min = 7, max = 50, message = "URL deve ser entre 7 e 50 caracteres")
	public String getUrlPortal() {
		return urlPortal;
	}

	public void setUrlPortal(String urlPortal) {
		this.urlPortal = urlPortal;
	}

	@OneToMany(mappedBy = "municipio")
	public List<ArquivoModel> getArquivos() {
		return arquivos;
	}

	public void setArquivos(List<ArquivoModel> arquivos) {
		this.arquivos = arquivos;
	}
}
