package com.example.actuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@EnableCaching
public class ActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorDemoApplication.class, args);
	}

}
