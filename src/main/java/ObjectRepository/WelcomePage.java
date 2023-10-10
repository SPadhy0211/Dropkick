package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class WelcomePage {
	
	AndroidDriver driver;
	
	@FindBy(id = "com.dropkick.android:id/imageProfile")
	private WebElement imgProfile;
	
	@FindBy(id = "com.dropkick.android:id/textViewEdit")
	private WebElement editBtn;
	
	@FindBy(id = "com.dropkick.android:id/textViewUsername")
	private WebElement name;
	
	@FindBy(xpath = "//android.widget.TextView[@text='WISHLIST & COLLECTION']")
	private WebElement wishlistLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ACCOUNT INFORMATION']")
	private WebElement accInfoLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='MY ORDERS']")
	private WebElement myOrdersLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ADDRESS BOOK']")
	private WebElement addressLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='PAYMENT METHODS']")
	private WebElement paymentLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='MY PREFERENCES']")
	private WebElement preferencesLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='SUPPORT']")
	private WebElement supportLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='FAQS']")
	private WebElement FAQSLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='POLICIES']")
	private WebElement policiesLink;
	
	@FindBy(xpath = "//android.widget.TextView[@text='COUNTRY']")
	private WebElement countryLink;
	
	@FindBy(id = "com.dropkick.android:id/cardView")
	private WebElement signOutBtn;
	
	public WelcomePage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getImgProfile() {
		return imgProfile;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getAccInfoLink() {
		return accInfoLink;
	}

	public WebElement getMyOrdersLink() {
		return myOrdersLink;
	}

	public WebElement getAddressLink() {
		return addressLink;
	}

	public WebElement getPaymentLink() {
		return paymentLink;
	}

	public WebElement getPreferencesLink() {
		return preferencesLink;
	}

	public WebElement getSupportLink() {
		return supportLink;
	}

	public WebElement getFAQSLink() {
		return FAQSLink;
	}

	public WebElement getPoliciesLink() {
		return policiesLink;
	}

	public WebElement getCountryLink() {
		return countryLink;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
	
	
	
	

}
