package com.aditya.tech.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/")
	public String Hello() {
		return "Hello World";
	}
}
