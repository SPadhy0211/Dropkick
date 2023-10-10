package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SelectCountryPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='United Arab Emirates']")
	private WebElement UAEBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Kuwait']")
	private WebElement KuwaitBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Saudi Arabia']")
	private WebElement SoudiArabiaBtn;
	
	@FindBy(id = "com.dropkick.android:id/cardView")
	private WebElement nextBtn;
	
	public SelectCountryPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getUAEBtn() {
		return UAEBtn;
	}

	public WebElement getKuwaitBtn() {
		return KuwaitBtn;
	}

	public WebElement getSoudiArabiaBtn() {
		return SoudiArabiaBtn;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}
	
	//Business logic
	public void selectUAE()
	{
		UAEBtn.click();
		nextBtn.click();
	}
	
	
	
	
	
	

}
