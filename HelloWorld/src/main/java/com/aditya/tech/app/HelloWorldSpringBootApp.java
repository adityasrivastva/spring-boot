package com.aditya.tech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.aditya.tech"})
public class HelloWorldSpringBootApp {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringBootApp.class, args);
	}
}
