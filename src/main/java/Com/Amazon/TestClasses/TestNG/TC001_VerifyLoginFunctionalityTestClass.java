package Com.Amazon.TestClasses.TestNG;

import org.testng.annotations.Test;

public class TC001_VerifyLoginFunctionalityTestClass extends TestBaseClassAmazon
{

	@Test
	public void loginFuncionality()
	{
		String altualtitle = driver.getTitle();
		System.out.println(altualtitle);
		String expectedtitle = ("Amazon.com. Spend less. Smile more.");

		if (altualtitle.equals(expectedtitle)) {
			System.out.println("Test Case passed, title matched");
		} else {
			System.out.println("Test Case failed, title not matched");
		}

	}

}
