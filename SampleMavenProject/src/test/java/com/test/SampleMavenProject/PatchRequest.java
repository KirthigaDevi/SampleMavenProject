package com.test.SampleMavenProject;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PatchRequest {


	public String requestBody = "{\n" +
			"  \"last_name\": \"Robertupdated\",\n" +
			"  \"email\": \"Newrobert@testmail.com\" \n}";

	@BeforeSuite
	public  void setup() {
		RestAssured.baseURI = "http://localhost:3000";
	}

	@Test
	public void patchRequest() {

		//JSONObject jsonobject = new JSONObject();

		Response response = RestAssured.given()
				.header("Content-type", "application/json")
				.and()
				.body(requestBody)
				.when()
				.patch("/employees/31")
				.then()
				.extract().response();


	}


}
