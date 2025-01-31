package DropdownTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTesting5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(drop);
		List<WebElement> allitems=s1.getOptions();
       
		System.out.println("no of items"+allitems.size());
		
		for(WebElement item:allitems)
		{
			System.out.println(item.getText());
		}
		driver.quit();
	}

}