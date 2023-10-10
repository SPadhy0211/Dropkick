package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='WHAT’S NEW']")
	private WebElement whatsNewModule;
	
	@FindBy(xpath = "//android.widget.TextView[@text='DROPS']")
	private WebElement dropsModule;
	
	@FindBy(xpath = "//android.widget.TextView[@text='MERCH']")
	private WebElement merchModule;
	
	@FindBy(id = "com.dropkick.android:id/navigation_bar_item_large_label_view")
	private WebElement homeModule;
	
	@FindBy(xpath = "//android.widget.TextView[@text='EAVESDROPS']")
	private WebElement eavesdropsModule;
	
	@FindBy(xpath = "//android.widget.TextView[@text='SHOP']")
	private WebElement shopModule;
	
	@FindBy(xpath = "//android.widget.TextView[@text='BAG']")
	private WebElement bagModule;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ACCOUNT']")
	private WebElement accountModule;
	
	@FindBy(id = "com.dropkick.android:id/textViewSearch")
	private WebElement searchBox;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoDetail")
	private WebElement hotListArrowBtn;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoDetail")
	private WebElement bestSellerArrowBtn;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoDetail")
	private WebElement freshFitBtn;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoDetail")
	private WebElement extraSauceArrowBtn;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoDetail")
	private WebElement eavesDropsArrowBtn;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoDetail")
	private WebElement merchArrow;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoDetail")
	private WebElement exclusiveBtn;
	
	public HomePage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getWhatsNewModule() {
		return whatsNewModule;
	}

	public WebElement getDropsModule() {
		return dropsModule;
	}

	public WebElement getMerchModule() {
		return merchModule;
	}

	public WebElement getHomeModule() {
		return homeModule;
	}

	public WebElement getEavesdropsModule() {
		return eavesdropsModule;
	}

	public WebElement getShopModule() {
		return shopModule;
	}

	public WebElement getBagModule() {
		return bagModule;
	}

	public WebElement getAccountModule() {
		return accountModule;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getHotListArrowBtn() {
		return hotListArrowBtn;
	}

	public WebElement getBestSellerArrowBtn() {
		return bestSellerArrowBtn;
	}

	public WebElement getFreshFitBtn() {
		return freshFitBtn;
	}

	public WebElement getExtraSauceArrowBtn() {
		return extraSauceArrowBtn;
	}

	public WebElement getEavesDropsArrowBtn() {
		return eavesDropsArrowBtn;
	}

	public WebElement getMerchArrow() {
		return merchArrow;
	}

	public WebElement getExclusiveBtn() {
		return exclusiveBtn;
	}
	
	//business logic
	public void clickOnShop()
	{
		shopModule.click();
	}

	public void clickOnAccount()
	{
		accountModule.click();
	}
}
