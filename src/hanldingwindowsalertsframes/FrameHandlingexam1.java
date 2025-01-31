package hanldingwindowsalertsframes;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandlingexam1 {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	}
	@Test
	public void alerthandle() throws InterruptedException
	{
				
		driver.switchTo().frame("a077aa5e");
				
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		 
		Iterator<String> it=allwindows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			
			if(driver.getTitle().equals("Selenium Live Project: FREE Real Time Project for Practice"))
			{
				break;
			}
		}
		
		List<WebElement> tutorialTitles=driver.findElements(By.xpath("//p[text()='Top Tutorials']/ancestor::div[contains(@class,'wp-block-kadence-column')][1]/descendant::span[@class='kt-blocks-info-box-title']"));
            		
        for(WebElement titles:tutorialTitles)
        {
        	System.out.println("Tutorial Titles:"+titles.getText());
        }
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
}
