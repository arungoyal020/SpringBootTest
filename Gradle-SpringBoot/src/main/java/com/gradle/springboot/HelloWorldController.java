package com.gradle.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String getHello()
	{
		return "Hello World";
	}
	
	
	@RequestMapping("/countries")
	public List<String> getAllCountries(){
		
		return Arrays.asList("India","US","England","China");
	}
	
	
}
