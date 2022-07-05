package com.test.SampleMavenProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


public class GetAllUsers {

	@Test
public void getRequestlocal() {
	
	Response response = RestAssured.get(" http://localhost:3000/employees");
	//response.getBody();
		ResponseBody responsebody = response.body();
		
		//System.out.println(responsebody.asString());
		System.out.println(responsebody.asPrettyString());
		
}
	
	
		
		
	}
