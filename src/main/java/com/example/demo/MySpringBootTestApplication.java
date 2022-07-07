package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootTestApplication.class, args);
		System.out.println("Welcome to jenkins...");
	}

}
