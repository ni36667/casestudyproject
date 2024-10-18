package com.weatherapi.casestudy.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.weatherapi.casestudy.model.WeatherAttributes;

@Service
public class WeatherAttributesService {
	
	@Autowired
	private DynamoDBMapper dynamoDBMapper;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${openweather.api.key.url}")
	private String weatherApiUrl;
	
		
	public WeatherAttributes getWeatherDetails(String city) {
		Map<String, String> map = new HashMap<>();
		map.put("city", city);
		WeatherAttributes weatherDetails = restTemplate.getForObject(weatherApiUrl, WeatherAttributes.class, map);
		dynamoDBMapper.save(weatherDetails);
		return weatherDetails;
	}
	
	public String deletetWeatherDetails(String city) {
		Map<String, String> map = new HashMap<>();
		map.put("city", city);
		WeatherAttributes weatherDetails = restTemplate.getForObject(weatherApiUrl, WeatherAttributes.class, map);
		dynamoDBMapper.delete(weatherDetails);
		return "Record Deleted From DynamoDB Successfully";
	}

}
