package com.gradle.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainConfig {
	public static void main(String[] args) {
		System.out.println("Config init");
		SpringApplication.run(MainConfig.class, args);
	}

}
