package com.test.SampleMavenProject;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteMultipleRecord {

	@BeforeSuite
	public  void setup() {
		RestAssured.baseURI = "http://localhost:3000";
	}

	@Test
	public void deleteRequest() {

		Response response = RestAssured.given()
				.header("Content-type", "application/json")
				.when()
				.delete("/employees/34,35")
				.then()
				.extract().response();


	}


}
