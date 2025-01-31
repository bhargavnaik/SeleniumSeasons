package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting3 {

	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement Link = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
		
		List<WebElement> allLinks=Link.findElements(By.tagName("a"));
		
		System.out.println("no of Links"+allLinks.size());
	
		for(WebElement Link1:allLinks)
		{
			System.out.println(Link1.getText());
		}
	}

}