package com.example.spring1.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring1.utils.Bike;
import com.example.spring1.utils.Bike2;

@RestController
@RequestMapping("/hui04")
public class Hui04 {
	@Autowired
	private Bike bike1;

	@Autowired
	private Bike bike2;

	@Autowired
	@Qualifier("bike1")
	private Bike bike3;
	
	@Autowired
	private Bike2 mybike;
	
	@RequestMapping("/test1")
	public void test1() {
		System.out.println("Hui04:test1()");
		bike1.upSpeed();
		bike2.upSpeed();
		bike3.upSpeed();
		mybike.upSpeed();
	}
}
