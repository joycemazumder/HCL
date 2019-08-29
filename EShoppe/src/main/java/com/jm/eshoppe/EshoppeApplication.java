package com.jm.eshoppe;

import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration
//@EnableWebMvc
@SpringBootApplication
@ComponentScan({"com.jm.eshoppe","com.jm.eshoppe.controller","com.jm.eshoppe.vo"})
public class EshoppeApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(EshoppeApplication.class);
	}

	public static void main(String[] args) {

		System.out.println("EShoppe........");
		SpringApplication.run(EshoppeApplication.class, args);
	}

}
