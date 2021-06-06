package br.com.stonks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class UsuarioModel {

	private int idUsuario;
	private String email;
	private String telefone;
	private String senha;
	
	
	private MunicipioModel municipio;


	public UsuarioModel(int idUsuario, String email, String telefone, String senha, MunicipioModel municipio) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.municipio = municipio;
	}
	
	public UsuarioModel() {
		
	}

	@Id
	@Column(name="ID_USUARIO")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="USUARIO_SEQ")
	@SequenceGenerator(name = "USUARIO_SEQ", sequenceName="USUARIO_SEQ", allocationSize = 1)
	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="TELEFONE")
	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name="SENHA")
	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	@ManyToOne
	@JoinColumn(name="ID_MUNICIPIO", nullable = false)
	public MunicipioModel getMunicipio() {
		return municipio;
	}


	public void setMunicipio(MunicipioModel municipio) {
		this.municipio = municipio;
	}
	
	
	
}
