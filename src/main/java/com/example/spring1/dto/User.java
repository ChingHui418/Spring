package com.example.spring1.dto;

import java.util.Map;

public class User {
	public String name;
	private Boolean gender;
	private Integer age;
	private Bike bike;
	private String[] alias;
	private Map<String, Object> test;
	
	
	
	public Map<String, Object> getTest() {
		return test;
	}
	public void setTest(Map<String, Object> test) {
		this.test = test;
	}
	public String[] getAlias() {
		return alias;
	}
	public void setAlias(String[] alias) {
		this.alias = alias;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
