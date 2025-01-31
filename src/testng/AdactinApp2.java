package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdactinApp2 {

		@Test (priority = 2)
		public void loginTest()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Lunched..");
			Assert.assertTrue(false);
			System.out.println("login successful..");
			System.out.println("browser closed..");
		}
		
		@Test (priority = 3)
		public void forgotPassword()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Lunched..");
			System.out.println("forgotPassword successful..");
			System.out.println("browser closed..");
		}
		
		@Test   (priority = 1,dependsOnMethods = "loginTest" )
		public void Registration()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Lunched..");
			System.out.println("Registration successful..");
			System.out.println("browser closed..");
		}
}
