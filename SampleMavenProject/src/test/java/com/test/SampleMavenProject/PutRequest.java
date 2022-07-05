package com.test.SampleMavenProject;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;

public class PutRequest {

	
	 public String requestBody = "{\n" +
	            "  \"first_name\": \"Lynnette B. Woody\",\n" +
	            "  \"last_name\": \"Woody\",\n" +
	            "  \"email\": \"Woody@testmail.com\" \n}";

	    @BeforeSuite
	    public  void setup() {
	        baseURI = "http://localhost:3000";
	    }

	    @Test
	    public void putRequest() {
	    	
	    	//JSONObject jsonobject = new JSONObject();
	    	
	        
	    	 given().header("Content-type", "application/json")
	                .and()
	                .body(requestBody)
	                .when()
	                .put("/employees/29")
	                .then()
	                .extract().response();

	    
	}
	
	
}
