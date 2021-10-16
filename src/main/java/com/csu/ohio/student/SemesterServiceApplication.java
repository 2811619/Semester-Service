package com.csu.ohio.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SemesterServiceApplication extends SpringBootServletInitializer {

	/*Added by KZN for deploying it as war on any server*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SemesterServiceApplication.class);
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(SemesterServiceApplication.class, args);
	}

}