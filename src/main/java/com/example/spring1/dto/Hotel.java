package com.example.spring1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {
	private Long id;
	
	@JsonProperty("Name")
	private String name;

	@JsonProperty("Address")
	private String addr;

	@JsonProperty("Tel")
	private String tel;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
