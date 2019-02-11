package com.application.reservationService;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@MapperScan("com.reservationService.mapper")
@ComponentScan({"com.reservationService.controller","com.reservationService.domain","com.reservationService.config"})
@EnableDiscoveryClient
public class ReservationServiceApplication extends SpringBootServletInitializer  {
	
	 
	
	private Logger log=LoggerFactory.getLogger(ReservationServiceApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}
	
	 
}
