package com.test.SampleMavenProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\kirthiga.ravi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		String url = "http://172.24.133.85:4444/wd/hub";
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("firefox");
		desiredCapabilities.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(url), desiredCapabilities);
		
		//WebDriver driver1 = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.quit();
	}

	
}
