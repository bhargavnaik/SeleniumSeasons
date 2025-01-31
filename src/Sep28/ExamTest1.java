package Sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getAttribute("href"));
		driver.findElement(By.linkText("New User Register Here")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();
		
        System.out.println(driver.findElement(By.linkText("Go to Build 2")).getAttribute("href"));
		driver.findElement(By.linkText("Go to Build 2")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.navigate().back();
		
        System.out.println(driver.findElement(By.linkText("info@adactin.com")).getAttribute("href"));
		driver.findElement(By.linkText("info@adactin.com")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		driver.quit();
	}

}
