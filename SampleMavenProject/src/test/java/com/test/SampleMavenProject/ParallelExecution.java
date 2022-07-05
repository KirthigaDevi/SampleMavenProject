	package com.test.SampleMavenProject;

	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	
	public class ParallelExecution {
	
		@Test
		public void OpenGoogle() {

			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().window().maximize();
			//*****Login to Amazon*****

			/*
			 * driver.findElement(By.linkText("Sign in")).click();
			 * driver.findElement(By.id("ap_email")).sendKeys("kirthigatest@gmail.com");
			 * driver.findElement(By.id("continue")).click();;
			 * driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
			 * driver.findElement(By.id("signInSubmit")).click();
			 */
			//*****Adding Product to cart*****

			/*
			 * //*driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).
			 * sendKeys("macbook air"+Keys.ENTER); driver.findElement(By.xpath(
			 * "//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"
			 * )).click();
			 * 
			 * String homeAmazon = driver.getWindowHandle(); Set<String> handels =
			 * driver.getWindowHandles();
			 * 
			 * for (String newwindow : handels) { driver.switchTo().window(newwindow); }
			 * driver.findElement(By.id("add-to-cart-button")).click();
			 * 
			 * 
			 */

			System.out.println("***Login Successfull in Chrome***");
		}

		@Test
		public void OpenEdge() {
			System.setProperty("webdriver.edge.driver", "C:\\eclipse\\drivers\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().window().maximize();
			//*****Login to Amazon*****

			/*
			 * driver.findElement(By.linkText("Sign in")).click();
			 * driver.findElement(By.id("ap_email")).sendKeys("kirthigatest@gmail.com");
			 * driver.findElement(By.id("continue")).click();;
			 * driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
			 * driver.findElement(By.id("signInSubmit")).click();
			 */

			//*****Adding Product to cart*****

			/*
			 * driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).
			 * sendKeys("macbook air"+Keys.ENTER); driver.findElement(By.xpath(
			 * "//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"
			 * )).click();
			 * 
			 * String homeAmazon = driver.getWindowHandle(); Set<String> handels =
			 * driver.getWindowHandles();
			 * 
			 * for (String newwindow : handels) { driver.switchTo().window(newwindow); }
			 * driver.findElement(By.id("add-to-cart-button")).click();
			 */
			System.out.println("***Login Successfull in EDGE***");


		}
		@Test
		public void OpenFirefox() {
			System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().window().maximize();
			//*****Login to Amazon*****

			/*
			 * driver.findElement(By.linkText("Sign in")).click();
			 * driver.findElement(By.id("ap_email")).sendKeys("kirthigatest@gmail.com");
			 * driver.findElement(By.id("continue")).click();;
			 * driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
			 * driver.findElement(By.id("signInSubmit")).click();
			 */

			//*****Adding Product to cart*****

			/*
			 * driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).
			 * sendKeys("macbook air"+Keys.ENTER); driver.findElement(By.xpath(
			 * "//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"
			 * )).click();
			 * 
			 * String homeAmazon = driver.getWindowHandle(); Set<String> handels =
			 * driver.getWindowHandles();
			 * 
			 * for (String newwindow : handels) { driver.switchTo().window(newwindow); }
			 * driver.findElement(By.id("add-to-cart-button")).click();
			 */
			System.out.println("***Login Successfull in FIREFOX***");

		}
	}


