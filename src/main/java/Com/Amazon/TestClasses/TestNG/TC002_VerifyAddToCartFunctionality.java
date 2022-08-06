package Com.Amazon.TestClasses.TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.Amazon.POMClasses.Page_1_LoginFunctionalityPOM;
import Com.Amazon.POMClasses.Page_2_AddTocartFunctionalityPOM;
import Com.Kite.utilityClasses_ScreenShot.TakeScreenShot;

public class TC002_VerifyAddToCartFunctionality extends TestBaseClassAmazon
{

	@Test
	public void AddTocart() throws InterruptedException, IOException
	{
		
		// object of POM class

		Page_1_LoginFunctionalityPOM login = new Page_1_LoginFunctionalityPOM(driver);
		Page_2_AddTocartFunctionalityPOM AddtoCart = new Page_2_AddTocartFunctionalityPOM(driver);

		
		//Add to cart
		AddtoCart.clickedInSearch();
		TakeScreenShot.takeScreenShot(driver);
		AddtoCart.clickedInItem();
		TakeScreenShot.takeScreenShot(driver);
		AddtoCart.clickOnAddToCart();
		TakeScreenShot.takeScreenShot(driver);
		AddtoCart.clickOnCart();
		TakeScreenShot.takeScreenShot(driver);
		AddtoCart.allLinks();
		

		String altualtitle = driver.getTitle();
		System.out.println(altualtitle);
		String expectedtitle = ("Amazon.com Shopping Cart");

		if (altualtitle.equals(expectedtitle)) {
			System.out.println("Test Case passed, title matched");
		} else {
			System.out.println("Test Case failed, title not matched");
		}
	}

}
