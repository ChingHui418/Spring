package com.example.spring1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.spring1.dto.User;

@Configuration
public class MyConfig {
	public MyConfig() {System.out.println("MyConfig()");}
	
	public void m1() {System.out.println("MyConfig():m1()");}
	
	@Bean
	public User m2() {
		System.out.println("MyConfig():m2()");
		User user = new User();
		user.setName("Jack");
		return user;
	}
	
	public RestTemplate getRestTemolete() {
		return new RestTemplate();
	}
}
