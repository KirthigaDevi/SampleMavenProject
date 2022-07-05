package com.test.SampleMavenProject;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {

	
	 public String requestBody = "{\n" +
	            "  \"first_name\": \"Raja\",\n" +
	            "  \"last_name\": \"kumar\",\n" +
	            "  \"email\": \"Rajkumar@testmail.com\" \n}";

	    @BeforeSuite
	    public  void setup() {
	        RestAssured.baseURI = "http://localhost:3000";
	    }

	    @Test
	    public void postRequest() {
	    	
	    	JSONObject jsonobject = new JSONObject();
	    	
	        Response response = RestAssured.given()
	                .header("Content-type", "application/json")
	                .and()
	                .body(requestBody)
	                .when()
	                .post("/employees")
	                .then()
	                .extract().response();

	    
	}
	
	
}
