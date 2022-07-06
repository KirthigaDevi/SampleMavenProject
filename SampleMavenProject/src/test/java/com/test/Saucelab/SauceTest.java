package com.test.Saucelab;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SauceTest extends SaucelabBase {

	@Test
	public void OpenGoogle() {

		driver.navigate().to("https://www.amazon.in/");
		//WebDriverWait wait = new WebDriverWait(driver, 120);
		  driver.findElement(By.linkText("Sign in")).click();
		  driver.findElement(By.id("ap_email")).sendKeys("kirthigatest@gmail.com");
		  driver.findElement(By.id("continue")).click();;
		  driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
		  driver.findElement(By.id("signInSubmit")).click();
		 
	}

	@Test
	public void OpenFirefox() {

		driver.navigate().to("https://www.amazon.in/");
		//WebDriverWait wait = new WebDriverWait(driver, 120);
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("kirthigatest@gmail.com");
		driver.findElement(By.id("continue")).click();;
		driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
		driver.findElement(By.id("signInSubmit")).click();


	}


}


