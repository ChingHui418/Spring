package com.example.spring1.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
	private String orderDate;
	private List<OrderDetail> details = new ArrayList<>();
	
	
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<OrderDetail> getDetails() {
		return details;
	}
	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}
}
