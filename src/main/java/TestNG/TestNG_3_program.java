package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_3_program
{
     @BeforeMethod
     public void setupMethod()
   {
	System.out.println("Open Browser, enter url, login");
   }
     
     @Test
     public void verifyLoginFunctionality()
   {
	System.out.println("Login Functionality verification");
   }
     
     @AfterMethod
     public void postConditions()
   {
	System.out.println("Logout Activity, browser closed");
   } 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
