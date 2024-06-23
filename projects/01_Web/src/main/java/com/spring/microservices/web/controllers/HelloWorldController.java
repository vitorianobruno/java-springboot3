package com.spring.microservices.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(path="/")
	public String helloWorld() {
		return "Hello World!!!";
	}
}
