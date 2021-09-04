package br.com.elit.stonks.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="ARQUIVOS")
public class ArquivoModel {

    private int idArquivo;
    private String nomeArquivo;
    private Date dataEnvio;
    private MunicipioModel municipio;

    public ArquivoModel(int idArquivo, String nomeArquivo, Date dataEnvio) {
        super();
        this.idArquivo = idArquivo;
        this.nomeArquivo = nomeArquivo;
        this.dataEnvio = dataEnvio;
    }

    public ArquivoModel() {

    }

    @Id
    @Column(name="ID_ARQUIVO")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ARQUIVO_SEQ")
    @SequenceGenerator(name = "ARQUIVO_SEQ", sequenceName="ARQUIVO_SEQ", allocationSize = 1)
    public int getIdArquivo() {
        return this.idArquivo;
    }

    public void setIdArquivo(int idArquivo) {
        this.idArquivo = idArquivo;
    }

    @Column(name="NOME_ARQUIVO")
    @Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 50 caracteres")
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Column(name="DATA_ENVIO")
    @Size(min = 7, max = 50, message = "URL deve ser entre 7 e 50 caracteres")
    public Date getDataEnvio() {
        return this.dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

}
