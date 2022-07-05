package com.test.SampleMavenProject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class PostAUser {

	@Test

	public void postrequest() {

		JSONObject jsonobject = new JSONObject();

		jsonobject.put("first_name", "jsonUser");
		jsonobject.put("last_name", "jsonUser");
		jsonobject.put("email", "jsonUser@testmail.com");

		//System.out.println(jsonobject.toString());
		RestAssured.baseURI = "http://localhost:3000";

		ValidatableResponse response =  RestAssured.given()
		.header("Content-type", "application/json")
        .and()
		.body(jsonobject.toJSONString())
		.post("/employees")
		.then().statusCode(201);

	}

}
