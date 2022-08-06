package Com.Amazon.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Amazon.POMClasses.Page_1_LoginFunctionalityPOM;

public class Verify_1_LoginFunctionalityTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Chrome browser launched, maximised, wait applied");

		// object of POM class

		Page_1_LoginFunctionalityPOM login = new Page_1_LoginFunctionalityPOM(driver);

		login.clickeOnLoginPage();
		login.sendUsername();
		login.clickOnContinue();
		login.sendPassword();
		login.clickonLogin();

		String altualtitle = driver.getTitle();
		System.out.println(altualtitle);
		String expectedtitle = ("Amazon.com. Spend less. Smile more.");

		if (altualtitle.equals(expectedtitle)) {
			System.out.println("Test Case passed, title matched");
		} else {
			System.out.println("Test Case failed, title not matched");
		}

		// driver.close();
		System.out.println("Browser closed");

	}

}
