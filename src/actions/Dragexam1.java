package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dragexam1 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
	}

	@Test
	public void dragexam1() throws InterruptedException {

		Actions action = new Actions(driver);

		WebElement slide = driver.findElement(By.id("loanamountslider"));

		action.dragAndDropBy(slide, -80, 0).perform();
		
		WebElement slide1 = driver.findElement(By.id("loaninterestslider"));

		action.dragAndDropBy(slide1, 0, 0).perform();

    	WebElement slide2 = driver.findElement(By.id("loantermslider"));
			
    	action.dragAndDropBy(slide2, 5, 0).perform();
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);

		 driver.quit();
	}
}