package com.example.jpa;

import com.example.jpa.service.JpaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Valdisnei on 05/01/2017.
 */
@Component
public class ClasseA  {

    @Autowired
    private JpaServiceImpl myService;


    public void executeSomeThing(String teste){
        myService.doSomeThing(teste);
    }
}
