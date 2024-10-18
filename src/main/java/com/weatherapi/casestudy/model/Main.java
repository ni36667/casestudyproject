package com.weatherapi.casestudy.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Main {

	@DynamoDBAttribute
    private double temp;
	
	@DynamoDBAttribute
    private double feels_like;
	
	@DynamoDBAttribute
    private double temp_min;
	
	@DynamoDBAttribute
    private double temp_max;
	
	@DynamoDBAttribute
    private int pressure;
	
	@DynamoDBAttribute
    private int humidity;
	
	@DynamoDBAttribute
    private int sea_level;
	
	@DynamoDBAttribute
    private int grnd_level;

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}

	public double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getSea_level() {
		return sea_level;
	}

	public void setSea_level(int sea_level) {
		this.sea_level = sea_level;
	}

	public int getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(int grnd_level) {
		this.grnd_level = grnd_level;
	}

	
}
