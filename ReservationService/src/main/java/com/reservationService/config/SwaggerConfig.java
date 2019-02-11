package com.reservationService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
 	
	 ApiInfo apiInfo = new ApiInfo(
             "Reservation and Ticket Service",
             "Reservation and Ticket Service API",
             "1.0",
             "Terms of service",
             new Contact("Joyce Mazumder", "", "joycemazumder@hotmail.com"),
            "Apache License Version 2.0",
             "https://www.apache.org/licenses/LICENSE-2.0");
    
	@Bean
	public Docket api()
	{
		return new   Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo);
		
	}
}
