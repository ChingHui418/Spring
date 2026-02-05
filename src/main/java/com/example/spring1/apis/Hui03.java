package com.example.spring1.apis;

import com.example.spring1.Spring01Application;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // => Bean => IoC => Server Starting
@RequestMapping("/member")
public class Hui03 {

    private final Spring01Application spring01Application;
	public Hui03(Spring01Application spring01Application) {System.out.println("Hui03()");this.spring01Application = spring01Application;}
	
	@RequestMapping("/del/5")
	public void test1() {
		System.out.println("Hui03:test1()");
	}
	
	@RequestMapping("/test2")
	public void test2() {
		System.out.println("Hui03:test2()");
	}
	
	@RequestMapping("/test3")
	public String test3() {
		System.out.println("Hui03:test3()");
		return "<h1>Hello, Jenny</h1>";
	}
}
