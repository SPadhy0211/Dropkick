package GenericUtils;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import javax.security.auth.callback.LanguageCallback;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.AccountPage;
import ObjectRepository.AdidasPage;
import ObjectRepository.FootwearPage;
import ObjectRepository.HomePage;
import ObjectRepository.LanguagePage;
import ObjectRepository.SelectCountryPage;
import ObjectRepository.ShopPage;
import ObjectRepository.SignInPage;
import ObjectRepository.SignUpPage;
import ObjectRepository.SneakersPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClassDropkick {
	AppiumDriverLocalService service;
	FileUtility fUtil = new FileUtility();
	public AndroidDriver driver;
	public static AndroidDriver sdriver;
	public SelectCountryPage sc;
	public LanguagePage lan;
	public HomePage hp;
	public ShopPage sp;
	public FootwearPage fp;
	public AccountPage accPage;
	public SignUpPage signup;
	public SignInPage signin;
	public SneakersPage sneakerPage; public AdidasPage adiPage;
	
	@BeforeSuite
	public void startServer()
	{
		File f = new File(IPathConstants.APPIUM_PATH);
		        service = new AppiumServiceBuilder().withAppiumJS(f)
				.withIPAddress("127.0.0.1").usingPort(4723)
				.withTimeout(Duration.ofSeconds(300)).build();
		service.start();
	}
	
	@BeforeMethod
	public void launchApp() throws Throwable
	{
		String platform_name = fUtil.readDataFromPropertyFile("platformName");
		String device_name = fUtil.readDataFromPropertyFile("deviceName");
		String automation_name = fUtil.readDataFromPropertyFile("automationName");
		String UDID = fUtil.readDataFromPropertyFile("UDID");
		String packageName = fUtil.readDataFromPropertyFile("appPackage");
		String activityName = fUtil.readDataFromPropertyFile("appActivity");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, automation_name);
		dc.setCapability(MobileCapabilityType.UDID, UDID);
		dc.setCapability("appPackage", packageName);
		dc.setCapability("appActivity", activityName);
		
		driver = new AndroidDriver(new URL(IPathConstants.URL), dc);
		sdriver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		sc = new SelectCountryPage(driver);
		lan = new LanguagePage(driver);
		hp = new HomePage(driver);
		sp = new ShopPage(driver);
		fp = new FootwearPage(driver);
		accPage = new AccountPage(driver);
		signup = new SignUpPage(driver);
		signin = new SignInPage(driver);
		sneakerPage = new SneakersPage(driver);
		adiPage = new AdidasPage(driver);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void stopServer()
	{
		service.stop();
	}

}
