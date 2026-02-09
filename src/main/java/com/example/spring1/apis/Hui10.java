package com.example.spring1.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.spring1.dto.Hotel;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/hui10")
public class Hui10 {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/test1")
	public void test1() {
		String url = "https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStay.aspx";
		
		String json = restTemplate.getForObject(url, String.class);
		System.out.println(json);
		
		ObjectMapper mapper = new ObjectMapper();
		List<Hotel> hotels = mapper.readValue(json, new TypeReference<List<Hotel>>() {});
		System.out.println(hotels.size());
	}
}
