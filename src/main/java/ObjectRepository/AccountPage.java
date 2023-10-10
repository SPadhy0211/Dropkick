package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class AccountPage {
	
	AndroidDriver driver;
	
	@FindBy(id = "com.dropkick.android:id/cardView")
	private WebElement signInBtn;
	
	@FindBy(id = "com.dropkick.android:id/textViewSignUp")
	private WebElement registerBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='WISHLIST & COLLECTION']")
	private WebElement wishlistAndCollectionBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='SUPPORT']")
	private WebElement supportBtn;
	
	public AccountPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

	public WebElement getWishlistAndCollectionBtn() {
		return wishlistAndCollectionBtn;
	}

	public WebElement getSupportBtn() {
		return supportBtn;
	}
	
	//business library
	public void clickOnSignIn()
	{
		signInBtn.click();
	}
	
	public void clickOnRegister()
	{
		registerBtn.click();
	}
	
	

}
