package com.application.flightService;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@MapperScan("com.flightService.mapper")
@ComponentScan({"com.flightService.controller","com.flightService.domain","com.flightService.config","com.flightService.exception"})
@EnableDiscoveryClient
public class FlightsServiceApplication extends SpringBootServletInitializer  {
	
	
	private Logger log=LoggerFactory.getLogger(FlightsServiceApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(FlightsServiceApplication.class, args);
	}
	
	 
}
