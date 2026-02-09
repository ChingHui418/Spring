package com.example.spring1.apis;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring1.config.JdbcConfig;
import com.example.spring1.dto.Order;
import com.example.spring1.dto.OrderDetail;

@RestController
@RequestMapping("/north")
public class Hui12 {
	
	private final JdbcConfig jdbcConfig;
	@Autowired
	@Qualifier("northJdbc")
	private NamedParameterJdbcTemplate northJdbc;
	
	Hui12(JdbcConfig jdbcConfig){
		this.jdbcConfig = jdbcConfig;
	}
	
	@GetMapping("/test1")
	public void test1() {
		String sql = "SELECT EmployeeID, FirstName, LastName, Title FROM employees";
		List<Map<String, Object>> rs = northJdbc.queryForList(sql, new HashMap<>());
		System.out.println(rs.size());
	}
	
	@GetMapping(value = {"order", "/orders/{orderId}"})
	public Order test2(@PathVariable(required = false) Integer orderId) {
		String sql = """
				SELECT
					o.OrderID id, o.OrderDate odate,
					p.ProductName pname, od.UnitPrice price, od.Quantity qty
				FROM orders o
				JOIN orderdetails od ON o.orderID = od.OrderID
				JOIN products p ON od.ProductID = p.ProductID
				WHERE o.OrderID = :orderId
				""";
		Map<String, Object> params = new HashMap<>();
		params.put("orderId", orderId);
		
		Order order = new Order();
		
		List<Map<String, Object>> details = northJdbc.queryForList(sql, params);
//		System.out.println(details.size());
		
		order.setOrderId((Integer)(details.get(0).get("id")));
		order.setOrderDate(((LocalDateTime) details.get(0).get("odate")).toString());
		
		for(Map<String, Object> detail: details) {
			OrderDetail od = new OrderDetail();
			od.setPname(detail.get("pname").toString());
			od.setPrice(Double.parseDouble(detail.get("price").toString()));
			od.setQty(Integer.parseInt(detail.get("qty").toString()));
			order.getDetails().add(od);
			
//			System.out.println(detail.get("id"));
//			System.out.println(detail.get("odate"));
//			System.out.println(detail.get("pname"));
//			System.out.println(detail.get("price"));
		}
		return order;
	}
}
