package testng;

import org.testng.annotations.Test;

public class AdactinApp1 {

		@Test (enabled=false)
		public void loginTest()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Lunched..");
			System.out.println("login successful..");
			System.out.println("browser closed..");
		}
		
		@Test(threadPoolSize= 1)
		public void forgotPassword()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Lunched..");
			System.out.println("forgotPassword successful..");
			System.out.println("browser closed..");
		}
		
		@Test
		public void Registration()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Lunched..");
			System.out.println("Registration successful..");
			System.out.println("browser closed..");
		}
}
