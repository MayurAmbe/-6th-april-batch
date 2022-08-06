package Com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_3_AmazonPayFunctionalityPOM {

	private WebDriver driver;

	// Click on amazon pay
	@FindBy(xpath = "//a[text()='Amazon Pay']")
	private WebElement amazonPay;

	public void clickOnAmazonPay() throws InterruptedException {
		amazonPay.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Amazon pay");

	}

	// Click on mobile reacharge
	@FindBy(xpath = "//span[text()='Mobile Recharge']")
	private WebElement mobilereacharge;

	public void clickOnMobileReacharge() throws InterruptedException {
		mobilereacharge.click();
		Thread.sleep(2000);
		System.out.println("Clicked on Mobile Reacharge");
	}

	// Click on mobile reacharge
	@FindBy(xpath = "(//input[@type='tel'])[1]")
	private WebElement mobileNumber;

	public void enterMobileNumber() throws InterruptedException {
		mobileNumber.sendKeys("9766990462");
		Thread.sleep(4000);
		System.out.println("Mobile number entered");
	}

	// Click on View plan
	@FindBy(xpath = "//a[@id='viewPlanTriggerId']")
	private WebElement viewplan;

	public void clickOnViewPlan() throws InterruptedException {
		viewplan.click();
		Thread.sleep(2000);
		System.out.println("Click on View plan");

	}

	// Click on Close the Plan popup
	@FindBy(xpath = "//button[@class=' a-button-close a-declarative']")
	private WebElement closePlanPopUp;

	public void ClickOnPlanClose() throws InterruptedException {
		closePlanPopUp.click();
		Thread.sleep(2000);
		System.out.println("PopUp Closed");
	}

	//constructor
	
	public Page_3_AmazonPayFunctionalityPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
