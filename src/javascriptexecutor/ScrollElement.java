package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollElement {

	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
     }
	
	@Test
	public void ScrollTest() throws InterruptedException
	{
		
		WebElement wb= driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//js.executeScript("arguments[0].scrollIntoView();", wb);
		
		   js.executeScript("arguments[0].click()", wb);
		   
		//wb.click();
	}

		@AfterMethod
	    public void tearDown() throws InterruptedException
	    {
	       Thread.sleep(3000);
			
			driver.quit();
	    }
	}
