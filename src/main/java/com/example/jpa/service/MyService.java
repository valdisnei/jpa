package com.example.jpa.service;

import org.springframework.stereotype.Component;

/**
 * Created by Valdisnei on 05/01/2017.
 */
@Component
public class MyService {


    public void executaSomething(String teste){
        System.out.println("teste = " + teste);
    }
}
