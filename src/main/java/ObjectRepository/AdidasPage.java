package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class AdidasPage {
	AndroidDriver driver;
	
	@FindBy(id = "com.dropkick.android:id/imageViewItem")
	private WebElement productImg;
	
	@FindBy(id = "com.dropkick.android:id/imageViewNext")
	private WebElement nextArrow;
	
	public AdidasPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getProductImg() {
		return productImg;
	}

	public WebElement getNextArrow() {
		return nextArrow;
	}
	
	GestureUtility gUtil = new GestureUtility(driver);
	//business library for Zoom Out and zoom in 
    public void clickOnProductImg() throws Throwable
    {
    	productImg.click();
    	WebElement element = productImg;
    	gUtil.pinchOpen(element);
    }

}
