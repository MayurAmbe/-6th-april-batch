package Com.Amazon.TestClasses.TestNG;

import org.testng.annotations.Test;

import Com.Amazon.POMClasses.Page_3_AmazonPayFunctionalityPOM;

public class TC003_VerifyAmazonPayFunctionality extends TestBaseClassAmazon {
	@Test
	public void amazonPay() throws InterruptedException {
		Page_3_AmazonPayFunctionalityPOM amazonPay = new Page_3_AmazonPayFunctionalityPOM(driver);

		amazonPay.clickOnAmazonPay();
		amazonPay.clickOnMobileReacharge();
		amazonPay.enterMobileNumber();
		amazonPay.clickOnViewPlan();
		amazonPay.ClickOnPlanClose();

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
