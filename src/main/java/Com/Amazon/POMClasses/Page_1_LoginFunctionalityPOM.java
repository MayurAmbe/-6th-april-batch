package Com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_1_LoginFunctionalityPOM {

	private WebDriver driver;

	// ClickFor Login page
	@FindBy(id = "nav-link-accountList")
	private WebElement clickeOnLoginPage;

	public void clickeOnLoginPage() throws InterruptedException {
		clickeOnLoginPage.click();
		Thread.sleep(1000);
		System.out.println("Clicked on login page");
	}

	// Username
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement username;

	public void sendUsername() throws InterruptedException {
		username.sendKeys("919766990462");
		Thread.sleep(1000);
		System.out.println("Username entered");
	}

	// Username continue
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement clickOnContinue;

	public void clickOnContinue() throws InterruptedException {
		clickOnContinue.click();
		Thread.sleep(1000);
		System.out.println("Clicked on continue");
	}

	// Password
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public void sendPassword() throws InterruptedException {
		password.sendKeys("mAYUR@1992");
		Thread.sleep(1000);
		System.out.println("Password entered");
	}

	// Login Button

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement LoginButton;

	public void clickonLogin() throws InterruptedException {
		LoginButton.click();
		Thread.sleep(1000);
		System.out.println("Login button clicked");
	}

	// Class Constructor

	public Page_1_LoginFunctionalityPOM(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
