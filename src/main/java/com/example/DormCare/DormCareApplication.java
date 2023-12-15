package com.example.DormCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.DormCare.controller")
public class DormCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DormCareApplication.class, args);
	}

}
