package com.test.SampleMavenProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class ChainMethod {


	@Test	

	public void getuserByChainmethod() {

		RestAssured.baseURI = "http://localhost:3000";

		
		  Response response = RestAssured.given().when().get("/employees/12");
		  ResponseBody responsebody = response.getBody();
		  System.out.println(response.asPrettyString());
		 
	ValidatableResponse validatableresponse = RestAssured.given().when().get("/employees/13").then().statusCode(200);

	
	
	}


}
