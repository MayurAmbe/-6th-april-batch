package Com.Kite.utilityClasses_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot
{

	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		String date=getdatetime();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\ScreenShot\\Senarios\\Kite-"+date+".png");
		FileHandler.copy(Source, Destination);
	}
	
	public static String getdatetime()
	{
		Date currentdate = new Date();
	    DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(currentdate);
		return date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		
		 TakeScreenShot.takeScreenShot(driver);
		

	}

}
