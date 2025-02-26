package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateLogin {

	WebDriver driver;
	
	@BeforeMethod()
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
		@Test
		public void validateLoginUsingValidCredentials()
		{
			driver.findElement(By.id("username")).sendKeys("reyaz0806");
			driver.findElement(By.id("password")).sendKeys("reyaz123");
			driver.findElement(By.id("login")).click();
			Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
		@Test
		public void validateLoginUsingInvalidPasswordCredential()
		{
			driver.findElement(By.id("username")).sendKeys("reyaz0806");
			driver.findElement(By.id("password")).sendKeys("reyaz124");
			driver.findElement(By.id("login")).click();
			Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
		@Test
		public void validateLoginUsingInvalidUsernameCredentialandValidpasswordCredential()
		{
			driver.findElement(By.id("username")).sendKeys("reyaz0807");
			driver.findElement(By.id("password")).sendKeys("reyaz123");
			driver.findElement(By.id("login")).click();
			Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
		@Test
		public void validateLoginUsingvalidUsernameandInvalidPasswordCredential()
		{
			driver.findElement(By.id("username")).sendKeys("reyaz0807");
			driver.findElement(By.id("password")).sendKeys("reyaz124");
			driver.findElement(By.id("login")).click();
			Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
		@Test
		public void validateLoginUsingEmptyUsernameandVaildPasswordCredential()
		{
			driver.findElement(By.id("username")).sendKeys("reyaz0807");
			driver.findElement(By.id("password")).sendKeys("reyaz124");
			driver.findElement(By.id("login")).click();
			Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
		@Test
		public void validateLoginUsingvalidUsernameandEmptyPasswordCredential()
		{
			driver.findElement(By.id("username")).sendKeys("reyaz0806");
			driver.findElement(By.id("password")).sendKeys("reyaz124");
			driver.findElement(By.id("login")).click();
			Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
		@Test
		public void validateLoginUsingInvalidUsernameandInvalidPasswordCredential()
		{
			driver.findElement(By.id("username")).sendKeys("reyaz0806");
			driver.findElement(By.id("password")).sendKeys("reyaz123");
			driver.findElement(By.id("login")).click();
			Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
			@Test
			public void validateLoginUsingemailverificationpeding()
			{
				driver.findElement(By.id("username")).sendKeys("reyaz0806");
				driver.findElement(By.id("password")).sendKeys("reyaz123");
				driver.findElement(By.id("login")).click();
				Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");	
		}
		@AfterMethod()
		public void teardown() throws InterruptedException
		{
			Thread.sleep(3000);
			
			driver.quit();
		}
	}
	


