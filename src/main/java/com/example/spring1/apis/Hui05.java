package com.example.spring1.apis;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring1.dto.User;

@RestController
@RequestMapping("/hui05")
public class Hui05 {
	
	@RequestMapping("/calc")  // /hui05/calc?x=10&y=3
	public String calc(
			@RequestParam(required = false, defaultValue = "0") String y, 
			@RequestParam(required = false, defaultValue = "0") String x) {
		/*  
		 *  if @RequestParam int/Integer
		 *	int x = (Integer.parseInt)((String)request.getParamter("x"));
		 *  ELSE
		 *  400
		 */
		System.out.printf("x = %s ; y = %s\n", x, y);
		try {
			int intX = Integer.parseInt(x);
			int intY = Integer.parseInt(y);
			int r = intX + intY;
			return r + "";
		}catch(Exception e) {
			return "ERROR";
		}
	}
	
	@RequestMapping("/test1")
	public void test1(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getGender());
		System.out.println(user.getAge());
		System.out.println(user.getBike().getSpeed());
		System.out.println(user.getAlias()[2]);
		System.out.println(user.getTest().get("key2"));
	}
	
	@RequestMapping("/test2/{name}/{id}")
	public void test2(@PathVariable String name,
			@PathVariable String id) {
		System.out.printf("%s : %s\n", id, name);
	}
	
	@RequestMapping("/test3")
	public void test3(@RequestHeader String x,
			@RequestHeader(name="Content-Type") String contentType) {
		System.out.println(x);
		System.out.println(contentType);
	}
	
	@RequestMapping("/test4/{name}/{id}")
	public void test4(
			@RequestParam(required = false, defaultValue = "0") String y, 
			@RequestParam(required = false, defaultValue = "0") String x,
			@RequestBody User user,
			@PathVariable String name,
			@PathVariable String id,
			@RequestHeader(name="x") String xx,
			@RequestHeader(name="Content-Type") String contentType) {
		System.out.printf("x = %s ; y = %s\n", x, y);
		System.out.println("------------");
		System.out.println(user.getName());
		System.out.println(user.getGender());
		System.out.println(user.getAge());
		System.out.println(user.getBike().getSpeed());
		System.out.println(user.getAlias()[2]);
		System.out.println(user.getTest().get("key2"));
		System.out.println("------------");
		System.out.printf("%s : %s\n", id, name);
		System.out.println("------------");
		System.out.println(xx);
		System.out.println(contentType);
	}
	
}
