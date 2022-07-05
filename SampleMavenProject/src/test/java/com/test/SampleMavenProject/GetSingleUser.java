package com.test.SampleMavenProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetSingleUser {


	@Test
	
	public void getSingleUser() {
		
	Response response =  RestAssured.get("http://localhost:3000/employees/11");
	ResponseBody responsebody = response.getBody();
	
	System.out.println(responsebody.asPrettyString());
	}
	
}
