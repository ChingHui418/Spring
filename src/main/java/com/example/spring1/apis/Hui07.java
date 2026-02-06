package com.example.spring1.apis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test07")
public class Hui07 {
	@Value("${company.name}")
	private String companyName;
	
	@Value("${company.tel}")
	private String companyTel;
	
	@RequestMapping("/m1")
	public void m1() {
		System.out.println("test07:m1()");
		System.out.println(companyName);
		System.out.println(companyTel);
	}
}
