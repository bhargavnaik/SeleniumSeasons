package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWaitdemo1 {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void waitsTest() throws InterruptedException
	{

		driver.findElement(By.xpath("//span[text()='2']")).click();
		
		driver.findElement(By.xpath("//span[text()='+']")).click();
		
		driver.findElement(By.xpath("//span[text()='9']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		 FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		                                                   .pollingEvery(Duration.ofMillis(300))
		                                                  .ignoring(NoSuchElementException.class);
		 wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@id='spinner']"))));
		 
		 Assert.assertEquals(driver.findElement(By.xpath("//div[@class='screen']")).getText(), "11");
	}                            
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
}
