package com.application.eureka.server.ApplicationEurekaServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

 

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServerApplication {

	private Logger log=LoggerFactory.getLogger(ApplicationEurekaServerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ApplicationEurekaServerApplication.class, args);
	}
}
