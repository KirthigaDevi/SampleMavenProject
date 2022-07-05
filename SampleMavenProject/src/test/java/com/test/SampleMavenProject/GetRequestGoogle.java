package com.test.SampleMavenProject;

import org.apache.http.StatusLine;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.google.co.in


		Response response = RestAssured.get("https://www.google.co.in");
//*** To get response as Status code ***
		int statuscode = response.statusCode();
		System.out.println(statuscode);

//*** To get response as Status line ***		
		String statusLine = response.statusLine();
		System.out.println(statusLine);

	}

}
