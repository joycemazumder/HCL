package com.application.passengerService;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.passengerService.mapper")
@ComponentScan({"com.passengerService.controller","com.passengerService.domain","com.passengerService.config","com.passengerService.exception","com.passengerService.proxy"})
@EnableFeignClients("com.passengerService")
@EnableDiscoveryClient
public class PassengerServiceApplication extends SpringBootServletInitializer  {
	 
	
	private Logger log=LoggerFactory.getLogger(PassengerServiceApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(PassengerServiceApplication.class, args);
	}
	
	 
}
