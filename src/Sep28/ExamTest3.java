package Sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExamTest3 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.linkText("Create new account")).getAttribute("href"));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.id("day")).sendKeys("28");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("month")).sendKeys("sep");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("year")).sendKeys("1998");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
