package webTables;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTbledemo1 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void webTableTest() throws InterruptedException, IOException {
		
		String  part=  "//table/tbody/tr[";
		String  part1= "]/td[1]/a";
		
		for(int i=1;i<=36;i++)
		{
			System.out.println(driver.findElement(By.xpath(part+i+part1)).getText());
		}
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}

}
