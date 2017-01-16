package com.example.jpa;

import com.example.jpa.service.JpaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {})
@ComponentScan(basePackages = { "com.example.jpa"})
//@SpringBootApplication
public class JpaApplication {

	@Autowired
	private JpaServiceImpl jpaServiceImpl;


	@Bean
	public MyNonSpring myNonSpring(){
		return new MyNonSpring(jpaServiceImpl);
	}
	//public static void main(String[] args) {
	//	SpringApplication.run(JpaApplication.class, args);
	//}

}
