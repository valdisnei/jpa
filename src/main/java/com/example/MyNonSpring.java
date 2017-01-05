package com.example;

import com.example.model.AcessoCaptadorOnline;
import com.example.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 * Created by Valdisnei on 04/01/2017.
 */
public class MyNonSpring {

    private static final MyNonSpring instance = new MyNonSpring();


    @Autowired
    private JpaService jpaService;

    private MyNonSpring() {
    }

    public static final MyNonSpring getInstance() {
        return instance;
    }


    public void doSomeThing(String teste){
        System.out.println("teste = " + teste);
        AcessoCaptadorOnline acessoCaptadorOnline = new AcessoCaptadorOnline();
        acessoCaptadorOnline.setData(LocalDateTime.now());
        acessoCaptadorOnline.setHabilitacaoCaptadorOnlineID(1L);
        acessoCaptadorOnline.setIdentificacaoCliente("2342342");
        acessoCaptadorOnline.setIdentificacaoServico("234234234");
        acessoCaptadorOnline.setStatusProcessamentoAcessoCaptadorOnlineID(1L);
        jpaService.save(acessoCaptadorOnline);
    }


}
