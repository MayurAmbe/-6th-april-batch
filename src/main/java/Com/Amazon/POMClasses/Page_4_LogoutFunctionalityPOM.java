package Com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_4_LogoutFunctionalityPOM
{

	private WebDriver driver;
	
	//profile mouse hover
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement profile;
	
	public void mouseHoverOnProfile() throws InterruptedException
	{
		Actions s = new Actions(driver);
		s.moveToElement(profile);
		Thread.sleep(3000);
		System.out.println("Mouse hover on profile");
	}
	
	
	//Click on logout
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement logout;
	
	public void clickOnLogout() throws InterruptedException
	{
		logout.click();
		Thread.sleep(3000);
		System.out.println("Clicked on LogOut");
		
	}
	
	//Constructor
	public Page_4_LogoutFunctionalityPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
