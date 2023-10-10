package ObjectRepository;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.ExcelUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SignInPage {

	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Email Address*']//following-sibling::android.widget.RelativeLayout//android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")
	private WebElement emailInput;;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Password*']/following-sibling::android.widget.RelativeLayout//android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")
	private WebElement pwdInput;
	
	@FindBy(id = "com.dropkick.android:id/textViewPasswordVisibility")
	private WebElement showBtn;
	
	@FindBy(id = "com.dropkick.android:id/textViewLoginWith")
	private WebElement mobileOrEmailOpt;
	
	@FindBy(xpath = "(//android.widget.FrameLayout[@resource-id='com.dropkick.android:id/cardView'])[1]")
	private WebElement signInBtn;
	
	public SignInPage(AndroidDriver driver)
	{
		this.driver=driver;
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
	
	public WebElement getShowBtn() {
		return showBtn;
	}
	
	public WebElement getMobileOrEmailOpt() {
		return mobileOrEmailOpt;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	ExcelUtility eUtil = new ExcelUtility();
	
	public void enterSignInDetails() throws Throwable
	{
	     Map<String, String> map = eUtil.readMultipleDataFromExcel("SignIn", 0, 1);
	     for(Entry<String, String> eachMap : map.entrySet())
	     {
	    	 String key = eachMap.getKey();
	    	 String value = eachMap.getValue();
	    	 
	    	 driver.findElement(AppiumBy.xpath(key)).sendKeys(value);
	     }
	     showBtn.click();
	     signInBtn.click();
	}
	
}
