package com.example.jpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.jpa"})
public class AppConfigTest {



    @Bean
    public ObjectMapper objectMapper(){
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.findAndRegisterModules();
        return csvMapper;
    }
}
