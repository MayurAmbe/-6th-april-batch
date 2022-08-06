package Com.Amazon.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_2_AddTocartFunctionalityPOM {

	private WebDriver driver;

	// Search

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchinput;

	// clicked on search
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement clickOnSearch;

	public void clickedInSearch() throws InterruptedException
	{
		searchinput.sendKeys("apple laptop");
		Thread.sleep(3000);
		clickOnSearch.click();
		System.out.println("apple laptop searched");
	}

	// clicked on search
	
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement clickOnItem;

	public void clickedInItem() throws InterruptedException {
		clickOnItem.click();
		Thread.sleep(4000);

		System.out.println("apple laptop item clicked ");
	}

	// clicked on Add to cart button
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement clickOnAddToCart;

	public void clickOnAddToCart() throws InterruptedException {
		clickOnAddToCart.click();
		Thread.sleep(3000);

		System.out.println("Clicked on Add To Cart tab ");
	}

	// clicked on cart
	@FindBy(xpath = "(//input[@class='a-button-input'])[23]")
	private WebElement clickOnCart;

	public void clickOnCart() throws InterruptedException {
		clickOnCart.click();
		Thread.sleep(3000);

		System.out.println("Clicked on Cart tab ");
	}

	
	
	//find links
	
	@FindBy(tagName ="a")
	private List<WebElement> allLinks;
	
	public void allLinks()
	{
		System.out.println(allLinks.size());
	}
	
	
	//Construction
	
	public Page_2_AddTocartFunctionalityPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
}
