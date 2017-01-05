package com.example.service;

import com.example.model.AcessoCaptadorOnline;
import com.example.repository.JpaExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Valdisnei on 05/01/2017.
 */
@Service
public class JpaService {


    @Autowired
    private JpaExampleRepository jpaRepository;

    public void save(AcessoCaptadorOnline acessoCaptadorOnline){
        jpaRepository.save(acessoCaptadorOnline);
    }

}
