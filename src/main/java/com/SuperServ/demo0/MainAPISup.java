package com.SuperServ.demo0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class MainAPISup extends SpringBootServletInitializer {
     
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(MainAPISup.class);
		
	}
	public static void main(String[] args) {
		SpringApplication.run(MainAPISup.class, args);
	}
	

}
