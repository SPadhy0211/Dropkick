package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FilterPage {
	
	AndroidDriver driver;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Product Type']")
	private WebElement productType;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Brand']")
	private WebElement brand;
	
    @FindBy(xpath = "//android.widget.TextView[@text='Franchise']")
	private WebElement franchise;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Clothing Size']")
	private WebElement clothingSize;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Shoe Size']")
	private WebElement shoeSize;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Gender']")
	private WebElement gender;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Colour']")
	private WebElement colour;
	
	@FindBy(id = "com.dropkick.android:id/cardViewWhiteInnerCheckbox")
	private WebElement checkBox;
	
	@FindBy(xpath = "(//android.widget.FrameLayout[@resource-id='com.dropkick.android:id/cardView'])[1]")
	private WebElement showResultsBtn;
	
	@FindBy(xpath = "(//android.widget.FrameLayout[@resource-id='com.dropkick.android:id/cardView'])[2]")
	private WebElement resetFilterBtn;
	
	@FindBy(id = "com.dropkick.android:id/imageViewGoCustom")
	private WebElement closeBtn;
	
	public FilterPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
