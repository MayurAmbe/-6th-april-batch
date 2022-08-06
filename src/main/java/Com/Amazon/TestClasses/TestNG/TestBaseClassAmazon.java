package Com.Amazon.TestClasses.TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Amazon.POMClasses.Page_1_LoginFunctionalityPOM;
import Com.Amazon.POMClasses.Page_4_LogoutFunctionalityPOM;
import Com.Kite.utilityClasses_ScreenShot.TakeScreenShot;

public class TestBaseClassAmazon 
{

	WebDriver driver;
	@Parameters("browsername")
	@BeforeClass
	public void browserlaunch(String browsername )
	{ if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();     //upcasting
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\FirefoxDriver.exe");
		driver = new FirefoxDriver();
	}
	else
	{
		System.out.println("throw an exception");
	}
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Chrome browser launched, maximised, wait applied");
	}
	
	@BeforeMethod
	public void setupMethod() throws InterruptedException, IOException
	{
		// object of POM class
		Page_1_LoginFunctionalityPOM login = new Page_1_LoginFunctionalityPOM(driver);

		login.clickeOnLoginPage();
		TakeScreenShot.takeScreenShot(driver);
		login.sendUsername();
		TakeScreenShot.takeScreenShot(driver);
		login.clickOnContinue();
		TakeScreenShot.takeScreenShot(driver);
		login.sendPassword();
		TakeScreenShot.takeScreenShot(driver);
		login.clickonLogin();
		TakeScreenShot.takeScreenShot(driver);
		
	}
	
	@AfterMethod
	public void logot() throws InterruptedException
	{
		Page_4_LogoutFunctionalityPOM logout = new Page_4_LogoutFunctionalityPOM(driver);

		logout.mouseHoverOnProfile();
		logout.clickOnLogout();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		System.out.println("Browser closed");
	}
	
	
	
	
}
