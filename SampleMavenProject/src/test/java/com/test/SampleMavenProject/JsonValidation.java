package com.test.SampleMavenProject;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class JsonValidation {
	
@Test
	public void checkLeagueId() {
		get("http://localhost:3000/team").then().body("data.leagueID", equalTo("35"));
		
	}
@Test
public void visitingTeam() {
	get("http://localhost:3000/team").then().body("data.visitingTeam", equalTo("India"));
	
}
@Test
public void weight() {
	get("http://localhost:3000/team").then().body("odds.weight", equalTo("1.3"));
	
}
@Test
public void time() {
	get("http://localhost:3000/team").then().time(lessThan(2L), TimeUnit.SECONDS);
}

@Test
public void haskeyvalidation() {
	get("http://localhost:3000/team").then().body("data", hasKey("homeTeam"));
}

@Test
public void hasEntryvalidation() {
	get("http://localhost:3000/team").then().body("data", hasEntry("homeTeam", "USA"));
}


}
