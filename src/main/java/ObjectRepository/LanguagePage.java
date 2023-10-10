package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LanguagePage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	private WebElement englishBtn;
	
    @FindBy(xpath = "//android.widget.TextView[@text='العربية']")
    private WebElement arabicBtn;
    
    @FindBy(id = "com.dropkick.android:id/cardView")
    private WebElement nextBtn;
    
    public LanguagePage(AndroidDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getEnglishBtn() {
		return englishBtn;
	}

	public WebElement getArabicBtn() {
		return arabicBtn;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}
    
    //Business Logic
	public void selectEnglish()
	{
		englishBtn.click();
		nextBtn.click();
	}
}
