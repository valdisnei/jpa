package com.example.jpa;

import com.example.jpa.model.AcessoCaptadorOnline;
import com.example.jpa.service.JpaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 * Created by Valdisnei on 04/01/2017.
 */
public class MyNonSpring {

    private JpaServiceImpl jpaServiceImpl;


    public MyNonSpring(JpaServiceImpl jpaServiceImpl) {
        this.jpaServiceImpl = jpaServiceImpl;
    }

    public void doSomeThing(String teste){
        System.out.println("teste = " + teste);
        AcessoCaptadorOnline acessoCaptadorOnline = new AcessoCaptadorOnline();
        acessoCaptadorOnline.setData(LocalDateTime.now());
        acessoCaptadorOnline.setHabilitacaoCaptadorOnlineID(1L);
        acessoCaptadorOnline.setIdentificacaoCliente("2342342");
        acessoCaptadorOnline.setIdentificacaoServico("234234234");
        acessoCaptadorOnline.setStatusProcessamentoAcessoCaptadorOnlineID(1L);
        jpaServiceImpl.save(acessoCaptadorOnline);
    }


}
