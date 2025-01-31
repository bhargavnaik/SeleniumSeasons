package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImplicitWait {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void waitsTest() throws InterruptedException
	{
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhargav");
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
}
