package com.example.spring1.apis;

import org.springframework.stereotype.Component;

/*
 *  IoC => Bean => Component (類別 => 物件) or @Bean (方法 => return 物件) 
 */

@Component
public class Hui01 {
	public Hui01() {
		System.out.println("Hui01()");
	}
	public Hui01(int a) {
		System.out.println("Hui01(int)");
	}
}
