package Sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest2 {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.linkText("Sell on Amazon")).getAttribute("href"));
        driver.findElement(By.linkText("Sell on Amazon")).click();
		Thread.sleep(3000);
		
//	   System.out.println(driver.getTitle());
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();

		System.out.println(driver.findElement(By.linkText("Sell under Amazon Accelerator")).getAttribute("href"));
        driver.findElement(By.linkText("Sell under Amazon Accelerator")).click();
		Thread.sleep(3000);
		
//		System.out.println(driver.getTitle());
//	    System.out.println(driver.getCurrentUrl());
//   	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();
	    
        System.out.println(driver.findElement(By.linkText("Protect and Build Your Brand")).getAttribute("href"));
        driver.findElement(By.linkText("Protect and Build Your Brand")).click();
        Thread.sleep(3000);
        
//        System.out.println(driver.getTitle());
// 	    System.out.println(driver.getCurrentUrl());
// 	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();
		
        System.out.println(driver.findElement(By.linkText("Amazon Global Selling")).getAttribute("href"));
        driver.findElement(By.linkText("Amazon Global Selling")).click();
        Thread.sleep(3000);
        
//        System.out.println(driver.getTitle());
// 	    System.out.println(driver.getCurrentUrl());
// 	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		   driver.navigate().back();
	
          System.out.println(driver.findElement(By.linkText("Supply to Amazon")).getAttribute("href"));
          driver.findElement(By.linkText("Supply to Amazon")).click();
          Thread.sleep(3000);
		
//        System.out.println(driver.getTitle());
// 	    System.out.println(driver.getCurrentUrl());
// 	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		   driver.navigate().back();
		
           System.out.println(driver.findElement(By.linkText("Become an Affiliate")).getAttribute("href"));
          driver.findElement(By.linkText("Become an Affiliate")).click();
          Thread.sleep(3000);
        
//        System.out.println(driver.getTitle());
// 	    System.out.println(driver.getCurrentUrl());
// 	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();
	
         System.out.println(driver.findElement(By.linkText("Fulfilment by Amazon")).getAttribute("href"));
        driver.findElement(By.linkText("Fulfilment by Amazon")).click();
        Thread.sleep(3000);
       
//        System.out.println(driver.getTitle());
// 	    System.out.println(driver.getCurrentUrl());
// 	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
         	driver.navigate().back();
		
        System.out.println(driver.findElement(By.linkText("Advertise Your Products")).getAttribute("href"));
        driver.findElement(By.linkText("Advertise Your Products")).click();
        Thread.sleep(3000);
		
//        System.out.println(driver.getTitle());
// 	    System.out.println(driver.getCurrentUrl());
// 	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();
	
        System.out.println(driver.findElement(By.linkText("Amazon Pay on Merchants")).getAttribute("href"));
        driver.findElement(By.linkText("Amazon Pay on Merchants")).click();
        Thread.sleep(3000);
        
//        System.out.println(driver.getTitle());
// 	    System.out.println(driver.getCurrentUrl());
// 	    System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		
		
		driver.quit();
		
	
	}

}
