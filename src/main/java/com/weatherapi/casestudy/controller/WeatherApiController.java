package com.weatherapi.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapi.casestudy.model.WeatherAttributes;
import com.weatherapi.casestudy.service.WeatherAttributesService;

@RestController
@RequestMapping("/weatherApi")
public class WeatherApiController {
	
	@Autowired
	public WeatherAttributesService weatherService;
	
	@GetMapping("/{city}")
	public WeatherAttributes getWeatherDetails(@PathVariable String city) throws Exception {
		return weatherService.getWeatherDetails(city);
	}
	
	@DeleteMapping("/{city}")
	public String deleteWeatherDetails(@PathVariable String city) {
		return weatherService.deletetWeatherDetails(city);
	}
	

}
 