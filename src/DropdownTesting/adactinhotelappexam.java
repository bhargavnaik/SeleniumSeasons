package DropdownTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinhotelappexam {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		driver.findElement(By.id("login")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("location")).sendKeys("Sydney");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
		driver.findElement(By.id("room_type")).sendKeys("Super Deluxe");
	
		driver.quit();
	}
	
	}

	

