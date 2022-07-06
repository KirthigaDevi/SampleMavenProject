package com.test.Saucelab;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SaucelabBase {


	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void SauceSetup(String browserName) {
		
		final String USERNAME= System.getenv("sauce_user");
		final String ACCESS_KEY=System.getenv("sauce_key");
		final String DRIVER_URL=System.getenv("sauce_driver");
		final String RemoteURL="https://" +USERNAME+":"+ACCESS_KEY+DRIVER_URL;

		/*
		 * 
		 * System.out.println("browser name is : " + browserName); MutableCapabilities
		 * sauceOpts = new MutableCapabilities(); sauceOpts.setCapability("build",
		 * "Java-W3C-Examples"); sauceOpts.setCapability("seleniumVersion", "3.141.59");
		 * sauceOpts.setCapability("username", "oauth-Kirthigadevib-9836a");
		 * sauceOpts.setCapability("accessKey", "35ad7b74-0156-4f1b-86d0-495abe30f577");
		 * //sauceOpts.setCapability("tags", "w3c-chrome-tests");
		 */
		System.out.println("browser name is : " + browserName);
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "Safari");
		caps.setCapability("appium:deviceName", "iPad Pro (12.9 inch) (5th generation) Simulator");
		caps.setCapability("appium:platformVersion", "15.4");
		caps.setCapability("unicodeKeyboard", true);
		caps.setCapability("resetKeyboard", true);
		caps.setCapability("extendedDebugging", true);
		caps.setCapability("capturePerformance", true);
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "1.22.3");
		sauceOptions.setCapability("build", "Mobile Web");
		sauceOptions.setCapability("name", "TestCase-01");
		sauceOptions.setCapability("username", "oauth-Kirthigadevib-9836a");
		sauceOptions.setCapability("accessKey", "35ad7b74-0156-4f1b-86d0-495abe30f577");
		caps.setCapability("sauce:options", sauceOptions);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("sauce:options", sauceOptions);
		cap.setCapability("browserVersion", "latest");
		cap.setCapability("platformName", "Windows 10");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			cap.setCapability("browserName", "chrome");

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			cap.setCapability("browserName", "firefox");
		} 

		try {
			driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), cap);
			driver.get("https://www.google.com");
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//WebDriverWait wait = new WebDriverWait(driver, 120);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	} 
	

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
