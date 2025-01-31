package hanldingwindowsalertsframes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindow2 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void MultipleWindow2Test() throws InterruptedException
	{
		
		String homeWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@src='img/google-play.png']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		Iterator<String> iterator=allwindows.iterator();
		
		while(iterator.hasNext())
		{
			driver.switchTo().window(iterator.next());
			
			if(driver.getTitle().equals("Not Found"))
			{
				System.out.println(driver.getTitle());
				break;
			}
		}
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
            
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            
            Thread.sleep(3000);
            
            driver.switchTo().window(homeWindow);
            
          driver.findElement(By.xpath("//img[@src='img/ios-button.png']")).click();
            
            allwindows=driver.getWindowHandles();
            iterator=allwindows.iterator();
            
            while(iterator.hasNext())
            {
            	driver.switchTo().window(iterator.next());
            	
            	if(driver.getTitle().equals("TestFlight - Apple"))
            	{
            		System.out.println(driver.getTitle());
            		break;
            	}
            }
            
            driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
            
           allwindows= driver.getWindowHandles();
           
           iterator=allwindows.iterator();
           
           while(iterator.hasNext())
           {
        	   driver.switchTo().window(iterator.next());
        	   
        	   if(driver.getTitle().equals("Legal - Apple Media Services - Apple"))
        	   {
        		   System.out.println(driver.getTitle());
   				break;
        	   }
           }
           
           driver.findElement(By.xpath("//a[@data-analytics-title='Choose your country/region']")).click();
           Thread.sleep(3000);
           
	}
	@AfterMethod
	public void teardown() throws InterruptedException
	{
          Thread.sleep(3000);
		
		driver.quit();
	}
}
