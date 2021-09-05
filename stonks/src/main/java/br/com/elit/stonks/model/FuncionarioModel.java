package br.com.elit.stonks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="FUNCIONARIOS")
public class FuncionarioModel {
    private int idFuncionario;
    private String nomeCompleto;
    private String cargo;
    private String cpf;
    private String dtNascimento;
    private String cep;

    public FuncionarioModel(String nomeCompleto, String cargo, String cpf, String dtNascimento, String cep) {
        this.nomeCompleto = nomeCompleto;
        this.cargo = cargo;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.cep = cep;
    }

    public FuncionarioModel() {
    }

    @Id
    @Column(name="ID_FUNCIONARIO")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="FUNCIONARIO_SEQ")
    @SequenceGenerator(name = "FUNCIONARIO_SEQ", sequenceName="FUNCIONARIO_SEQ", allocationSize = 1)
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Column(name="NOME_FUNCIONARIO")
    @Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 50 caracteres")
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    @Column(name="CARGO")
    @Size(min = 2, max = 50, message = "CARGO deve ser entre 2 e 50 caracteres")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Column(name="CPF")
    @Size(min = 2, max = 50, message = "CPF deve ser entre 2 e 50 caracteres")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Column(name="DT_NASCIMENTO")
    @Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 50 caracteres")
    public String getDtNascimente() {
        return dtNascimento;
    }

    public void setDtNascimente(String dtNascimente) {
        this.dtNascimento = dtNascimento;
    }
    @Column(name="CEP")
    @Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 50 caracteres")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}