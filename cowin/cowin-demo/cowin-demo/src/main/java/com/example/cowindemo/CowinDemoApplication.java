package com.example.cowindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class CowinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CowinDemoApplication.class, args);
	}

}
