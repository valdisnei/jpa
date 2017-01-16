package com.example.jpa.service;

import com.example.jpa.model.AcessoCaptadorOnline;
import com.example.jpa.repository.JpaExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Valdisnei on 05/01/2017.
 */
@Component
public class JpaServiceImpl{


    @Autowired
    private JpaExampleRepository jpaRepository;

    public void save(AcessoCaptadorOnline acessoCaptadorOnline){
        jpaRepository.save(acessoCaptadorOnline);
    }


    public void doSomeThing(String teste){
        System.out.println("jpaRepository = " + teste);
    }

}
