package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinApp3 {

	     @BeforeMethod(onlyForGroups = "smoke")
	     public void setUp()
	     {
	    	 System.out.println("Browser Started ..");
				System.out.println("App Lunched..");
	     }
	     @AfterMethod(onlyForGroups = "smoke")
	     public void tearDown()
	     {
	    	 System.out.println("browser closed..");
	     }
		@Test (priority = 2)
		public void loginTest()
		{
			System.out.println("login successful..");
			System.out.println("browser closed..");
		}
		
		@Test (priority = 3,groups = "smoke")
		public void forgotPassword()
		{
			System.out.println("forgotPassword successful..");
		}
		
		@Test   (priority = 1,groups = "smoke")
		public void Registration()
		{
			System.out.println("Registration successful..");
			
		}
		@Test(priority = 4,dependsOnMethods = "loginTest")
		public void changePasswordTest()
		{
			
			System.out.println("Change Password Successfull...");
			
}
}

