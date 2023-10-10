package ObjectRepository;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.ExcelUtility;
import GenericUtils.GestureUtility;
import GenericUtils.JavaUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;

public class SignUpPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Email Address*']/following-sibling::android.widget.RelativeLayout//android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")
	private WebElement emailInput;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Password*']/following-sibling::android.widget.RelativeLayout//android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")
	private WebElement pwdInput;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Password*']/following-sibling::android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.dropkick.android:id/textViewPasswordVisibility']")
	private WebElement pwdShowOpt;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm Password*']/following-sibling::android.widget.RelativeLayout//android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")
	private WebElement confirmPwdInput;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm Password*']/following-sibling::android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.dropkick.android:id/textViewPasswordVisibility']")
	private WebElement conPwdShowBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='First Name*']/following-sibling::android.widget.RelativeLayout//android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")
	private WebElement firstNameInput;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Last Name*']/following-sibling::android.widget.RelativeLayout//android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")
	private WebElement lastNameInput;
	
	@FindBy(id = "com.dropkick.android:id/textViewMale")
	private WebElement maleBtn;
	
	@FindBy(id = "com.dropkick.android:id/textViewFemale")
	private WebElement femaleBtn;
	
	@FindBy(id ="com.dropkick.android:id/textViewSignWith")
	private WebElement mobileOrEmailOpt;
	
	@FindBy(id = "com.dropkick.android:id/imageViewWhiteTick")
	private WebElement checkBox;
	
	@FindBy(xpath = "(//android.widget.FrameLayout[@resource-id='com.dropkick.android:id/cardView'])[1]")
	private WebElement createAccountBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sign In']")
	private WebElement signInLink;
	
	public SignUpPage(AndroidDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getPwdInput() {
		return pwdInput;
	}

	public WebElement getPwdShowOpt() {
		return pwdShowOpt;
	}

	public WebElement getConfirmPwdInput() {
		return confirmPwdInput;
	}

	public WebElement getConPwdShowBtn() {
		return conPwdShowBtn;
	}

	public WebElement getFirstNameInput() {
		return firstNameInput;
	}

	public WebElement getLastNameInput() {
		return lastNameInput;
	}

	public WebElement getMaleBtn() {
		return maleBtn;
	}

	public WebElement getFemaleBtn() {
		return femaleBtn;
	}

	public WebElement getMobileOrEmailOpt() {
		return mobileOrEmailOpt;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}
	
	//business library for signup
	ExcelUtility eUtil = new ExcelUtility();
	JavaUtility jUtil = new JavaUtility();
	int random = jUtil.getRandomNum();
	GestureUtility gUtil = new GestureUtility(driver);
	
	public void enterSignUpDetails() throws Throwable
	{
		String email="";
		Map<String, String> map = eUtil.readMultipleDataFromExcel("SignUp", 0, 1);
		for(Entry<String, String> eachMap : map.entrySet())
		{
			String key = eachMap.getKey();
			String value = eachMap.getValue();
			
			if(key.contains("Email Address*"))
			{
			    email = random+value;
			    driver.findElement(AppiumBy.xpath(key)).sendKeys(email);
			}
			else
			{
				driver.findElement(AppiumBy.xpath(key)).sendKeys(value);
			}
			
			femaleBtn.click();
//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign In\"));"));
			gUtil.scrollGesture("Sign In");
			createAccountBtn.click();
			
		}
				
	}

}
