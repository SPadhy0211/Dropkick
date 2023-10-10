package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FootwearPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ALL FOOTWEAR']")
	private WebElement allFootwearOpt;
	
	@FindBy(xpath = "//android.widget.TextView[@text='SLIDES']")
	private WebElement slidesOpt;
	
	@FindBy(xpath = "//android.widget.TextView[@text='SLIP ON SHOES']")
	private WebElement slipOnShoesOpt;
	
	@FindBy(xpath = "//android.widget.TextView[@text='SNEAKERS']")
	private WebElement sneakersOpt;
	
	public FootwearPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getAllFootwearOpt() {
		return allFootwearOpt;
	}

	public WebElement getSlidesOpt() {
		return slidesOpt;
	}

	public WebElement getSlipOnShoesOpt() {
		return slipOnShoesOpt;
	}

	public WebElement getSneakersOpt() {
		return sneakersOpt;
	}
	
	//business logic
	public void clickOnSneakers()
	{
		sneakersOpt.click();
	}

}
