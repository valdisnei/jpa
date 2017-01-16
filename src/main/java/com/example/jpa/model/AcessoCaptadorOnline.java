package com.example.jpa.model;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hibernate.annotations.Type;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Created by valdisnei on 04/01/17.
 */
@AutoProperty
@JsonPropertyOrder({ "acessoCaptadorOnlineID", "data", "identificacaoServico", "identificacaoCliente",
                    "habilitacaoCaptadorOnlineID",
                    "statusProcessamentoAcessoCaptadorOnlineID"})

@Entity
@Table(name = "acessocaptadoronline")
public class AcessoCaptadorOnline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "acessocaptadoronlineid", unique = true, nullable = false)
    private Long acessoCaptadorOnlineID;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "identificacaoservico", unique = false, nullable = false, length = 255)
    private String identificacaoServico;

    @Column(name = "identificacaocliente", unique = false, nullable = false, length = 255)
    private String identificacaoCliente;

    @Column(name = "habilitacaocaptadoronlineid", unique = false, nullable = false, length = 8)
    private Long habilitacaoCaptadorOnlineID;

    @Column(name = "statusprocessamentoacessocaptadoronlineid", unique = false, nullable = false, length = 8)
    private Long statusProcessamentoAcessoCaptadorOnlineID;



    public Long getAcessoCaptadorOnlineID() {
        return acessoCaptadorOnlineID;
    }

    public void setAcessoCaptadorOnlineID(Long acessoCaptadorOnlineID) {
        this.acessoCaptadorOnlineID = acessoCaptadorOnlineID;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getIdentificacaoServico() {
        return identificacaoServico;
    }

    public void setIdentificacaoServico(String identificacaoServico) {
        this.identificacaoServico = identificacaoServico;
    }

    public String getIdentificacaoCliente() {
        return identificacaoCliente;
    }

    public void setIdentificacaoCliente(String identificacaoCliente) {
        this.identificacaoCliente = identificacaoCliente;
    }

    public Long getHabilitacaoCaptadorOnlineID() {
        return habilitacaoCaptadorOnlineID;
    }

    public void setHabilitacaoCaptadorOnlineID(Long habilitacaoCaptadorOnlineID) {
        this.habilitacaoCaptadorOnlineID = habilitacaoCaptadorOnlineID;
    }

    public Long getStatusProcessamentoAcessoCaptadorOnlineID() {
        return statusProcessamentoAcessoCaptadorOnlineID;
    }

    public void setStatusProcessamentoAcessoCaptadorOnlineID(Long statusProcessamentoAcessoCaptadorOnlineID) {
        this.statusProcessamentoAcessoCaptadorOnlineID = statusProcessamentoAcessoCaptadorOnlineID;
    }

    @Override
    public String toString() {
        return Pojomatic.toString(this);
    }
}
