package DropdownTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinhotelappexam2 {

	public static void main(String[] args)  {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getTitle());
		
		WebElement drop1=driver.findElement(By.id("location"));
		List<WebElement> allItems1=drop1.findElements(By.tagName("option"));
		System.out.println("no of items :" +allItems1.size());
		
		
		WebElement drop2=driver.findElement(By.id("hotels"));
		List<WebElement> allItems2=drop2.findElements(By.tagName("option"));
		System.out.println("no of items" +allItems2.size());
		
		
		WebElement drop3=driver.findElement(By.id("room_type"));
		List<WebElement> allItems3=drop3.findElements(By.tagName("option"));
		System.out.println("no of items" +allItems3.size());
		
	    for(WebElement item:allItems1)
		{
			System.out.println(item.getText());		
			}
	    
	    for(WebElement item:allItems2)
		{
			System.out.println(item.getText());		
			}
	    
	    for(WebElement item:allItems3)
		{
			System.out.println(item.getText());		
			}
		
		driver.quit();
	}
	
	}

	

