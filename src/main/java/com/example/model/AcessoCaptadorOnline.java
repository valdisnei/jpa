package com.example.model;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Created by valdisnei on 04/01/17.
 */
//@AutoProperty
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

    @Transient
    private String responseRegistroOnline;


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

    public String getResponseRegistroOnline() {
        return responseRegistroOnline;
    }

    public void setResponseRegistroOnline(String responseRegistroOnline) {
        this.responseRegistroOnline = responseRegistroOnline;
    }

//    @Override
//    public String toString() {
//        return Pojomatic.toString(this);
//    }
}
