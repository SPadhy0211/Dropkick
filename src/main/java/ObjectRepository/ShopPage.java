package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ShopPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='FOOTWEAR']")
	private WebElement footwearOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text='APPAREL']")
	private WebElement apparelOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ACCESSORIES']")
	private WebElement accessoriesOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ALL PRODUCTS']")
	private WebElement allProductsOption;
	
	@FindBy(id = "com.dropkick.android:id/rlHeader")
	private WebElement searchBox;
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.dropkick.android:id/ivBrand'])[1]")
	private WebElement brand1Btn;
	
	public ShopPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getFootwearOption() {
		return footwearOption;
	}

	public WebElement getApparelOption() {
		return apparelOption;
	}

	public WebElement getAccessoriesOption() {
		return accessoriesOption;
	}

	public WebElement getAllProductsOption() {
		return allProductsOption;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getBrand1Btn() {
		return brand1Btn;
	}
	
	//Business logic
	public void clickOnFootwear()
	{
		footwearOption.click();
	}

}
