package com.flightweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.flightweb.controller","com.flightweb.exception","com.json.vo"})
public class FlightWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FlightWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("test...");
		SpringApplication.run(FlightWebApplication.class, args);
	}

}