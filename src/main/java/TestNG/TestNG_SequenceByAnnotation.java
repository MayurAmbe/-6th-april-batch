package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_SequenceByAnnotation 
{
    //1)Supportive annotation
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	
	//2) always maintain main scenario in test @
	@Test
	public void method1()
	{
		
		System.out.println("Test Method");
		
	}
	//3) Supportive annotation
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}
	
	//code sequence by annotation
	
	
	
}
