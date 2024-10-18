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
public class Clouds {
	
	@DynamoDBAttribute
    private int all;

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}
	
	
}
