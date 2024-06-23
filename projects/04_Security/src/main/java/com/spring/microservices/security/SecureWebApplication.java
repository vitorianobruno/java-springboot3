package com.spring.microservices.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureWebApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(SecureWebApplication.class, args);
	}

}
