package br.com.elit.stonks.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name="ARQUIVOS")
public class ArquivoModel {

    private int idArquivo;
    private String nomeArquivo;
    private LocalDate dataEnvio = LocalDate.now();
    private MunicipioModel municipio;

    public ArquivoModel(String nomeArquivo, MunicipioModel municipio) {
        this.nomeArquivo = nomeArquivo;
        this.municipio = municipio;
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
    public LocalDate getDataEnvio() {
        return this.dataEnvio;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
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
