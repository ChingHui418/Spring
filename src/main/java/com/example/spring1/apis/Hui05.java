package com.example.spring1.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hui05")
public class Hui05 {
	
	@RequestMapping("/calc")  // /hui05/calc?x=10&y=3
	public void calc(@RequestParam String x, @RequestParam String y) {
		System.out.printf("x = %s ; y = %s\n", x, y);
	}
}
