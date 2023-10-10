package GenericUtils;

import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.appmanagement.ApplicationState;

public class DriverUtility {
	AndroidDriver driver;
    public DriverUtility(AndroidDriver driver)
    {
    	this.driver = driver;
    }

	public void installApp()
	{
		driver.installApp("");
		System.out.println(driver.isAppInstalled(""));
	}
	
	public void runAppInBG()
	{
		driver.runAppInBackground(Duration.ofSeconds(30));
	}
	
	public void appActivate()
	{
		driver.activateApp("");
	}
	
	public void appState()
	{
		ApplicationState st = driver.queryAppState("");
		System.out.println(st);
	}
	
	public void uninstallApp()
	{
		driver.removeApp("");
	}
	
	public void notificationOpen()
	{
		driver.openNotifications();
	}
	
	public void hideKeyboard()
	{
		driver.hideKeyboard();
	}
	
	public void checkPhoneLock()
	{
		boolean lc = driver.isDeviceLocked();
		System.out.println(lc);
	}
	
	public void screenOrientation()
	{
		ScreenOrientation screen = driver.getOrientation();
		driver.rotate(screen.LANDSCAPE);
//		driver.rotate(screen.PORTRAIT);
	}

}
