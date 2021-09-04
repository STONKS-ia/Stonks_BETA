package br.com.elit.stonks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USUARIOS")
public class UsuarioModel {

	private int idUsuario;
	private String email;
	private String nome;
	private String telefone;
	private String senha;
	private MunicipioModel municipio;

	public UsuarioModel(int idUsuario, String email, String nome,String telefone, String senha, MunicipioModel municipio) {
		this.idUsuario = idUsuario;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.senha = senha;
		this.municipio = municipio;
	}

	public UsuarioModel() {
	}

	@Id
	@Column(name = "ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_SEQ")
	@SequenceGenerator(name = "USUARIO_SEQ", sequenceName = "USUARIO_SEQ", allocationSize = 1)
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name = "EMAIL")
	@Size(min = 2, max = 50, message = "EMAIL deve ser entre 2 e 50 caracteres")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "NOME")
	@Size(min = 2, max = 50, message = "Nome deve ser entre 2 e 50 caracteres")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "TELEFONE")
	@Size(min = 11, max = 11, message = "TELEFONE deve ter 11 numeros. Nao esqueca o DDD")
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "SENHA")
	@Size(min = 2, max = 10, message = "SENHA deve ser entre 2 e 10 caracteres")
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@ManyToOne
	@JoinColumn(name = "ID_MUNICIPIO", nullable = false)
	public MunicipioModel getMunicipio() {
		return municipio;
	}

	public void setMunicipio(MunicipioModel municipio) {
		this.municipio = municipio;
	}

}
