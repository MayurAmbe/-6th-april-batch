package Com.Amazon.TestClasses.TestNG;

import org.testng.annotations.Test;

import Com.Amazon.POMClasses.Page_4_LogoutFunctionalityPOM;

public class TC004_VerifyLogoutFunctionalityTestClass extends TestBaseClassAmazon {

	@Test
	public void logoutFunctionality() throws InterruptedException {

		Page_4_LogoutFunctionalityPOM logout = new Page_4_LogoutFunctionalityPOM(driver);

		logout.mouseHoverOnProfile();
		logout.clickOnLogout();

		String altualtitle = driver.getTitle();
		System.out.println(altualtitle);
		String expectedtitle = ("Amazon Sign-In");
		if (altualtitle.equals(expectedtitle)) {
			System.out.println("Test Case passed, title matched");
		} else {
			System.out.println("Test Case failed, title not matched");
		}

	}

}
