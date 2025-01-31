package drop1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DropDown10 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[1]/ancestor::div[13]/descendant::a[14]/child::div[3]/child::div/child::div[text()='Apple iPhone 16 (Black, 128 GB)']")).click();
	    Thread.sleep(2000);
	    

	}

}
