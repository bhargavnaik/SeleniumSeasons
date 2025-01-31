package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting2 {

	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		System.out.println("no.of Links" +allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)       //for loop
		{
			WebElement Links=allLinks.get(i);
			
			System.out.println(Links.getAttribute("href"));
			System.out.println(Links.getText());
		}
		driver.quit();

	}

}