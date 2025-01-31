package fileuploading;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void fileUploadTest() throws InterruptedException, IOException, AWTException 
	{
		
		driver.findElement(By.xpath("//span[@class='newPostLabel']")).click();
		driver.findElement(By.xpath("//label[text()='Choose Photo/Video']")).click();
		
		Thread.sleep(3000);
		
		String filePath= "C:\\Users\\DELL\\Desktop\\ECLIPSE\\adactin1.png";
		
		StringSelection string=new StringSelection(filePath);
		
		Toolkit toolKit=Toolkit.getDefaultToolkit();
		
		Clipboard  clipBoard=	toolKit.getSystemClipboard();
		
		clipBoard.setContents(string, null);
		
		//here we are using robot class
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);       //here we are dng key press like control+v press
		rb.keyPress(KeyEvent.VK_V);                       //here we are dng key press like control+v press 
		rb.keyRelease(KeyEvent.VK_V);                  //here we are dng key press like control+v release
		rb.keyRelease(KeyEvent.VK_CONTROL);   //here we are dng key press like control+v release
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);              
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}	
}
