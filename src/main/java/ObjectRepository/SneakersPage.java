package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.GestureUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SneakersPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='SNEAKERS']")
	private WebElement sneakersText;
	
	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.dropkick.android:id/relativeLayoutFilter']")
	private WebElement filterBtn;
	
	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.dropkick.android:id/relativeLayoutSort']")
	private WebElement sortBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.dropkick.android:id/textViewTotalCount']")
	private WebElement totalProductsText;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.dropkick.android:id/imageViewGoBack']")
	private WebElement backArrow;
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.dropkick.android:id/imageViewItem'])[1]")
	private WebElement product;
	
	public SneakersPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getSneakersText() {
		return sneakersText;
	}

	public WebElement getFilterBtn() {
		return filterBtn;
	}

	public WebElement getSortBtn() {
		return sortBtn;
	}

	public WebElement getTotalProductsText() {
		return totalProductsText;
	}

	public WebElement getBackArrow() {
		return backArrow;
	}
	
	public WebElement getProduct() {
		return product;
	}
	
	//business library to click on product
	public void clickOnProduct()
	{
		product.click();
	}

}
