package com.calculator.multiplyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class MultiplyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplyServiceApplication.class, args);
	}

}

