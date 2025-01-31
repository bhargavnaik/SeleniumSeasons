package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mouseclickexam1 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
	}

	@Test
	public void mouseexam() throws InterruptedException {
		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")))
				.click(driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"))).perform();

		action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")))
				.click(driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"))).perform();

		driver.findElement(By.xpath("//button[text()='single Click']")).click();
		
		WebElement button= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	     
		 //action.doubleClick(button).perform();
		
		 int noofclicks= 5;
		 
		for(int i=0;i<noofclicks;i++)
		{
			 action.doubleClick(button).perform();
			 Thread.sleep(3000);
		}
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);

		driver.quit();
	}
}
