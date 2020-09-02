package com.sapient.calculator;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CalculatorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
