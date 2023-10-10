package Dropkick.TestScripts;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtils.BaseClassDropkick;
import GenericUtils.GestureUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ProductImageZoomInAndOut extends BaseClassDropkick {
	
	@Test
	public void imagePinchOpenAndClose() throws Throwable
	{
		GestureUtility gUtil = new GestureUtility(driver);
		
		sc.selectUAE();
		lan.selectEnglish();
		hp.clickOnShop();
		sp.clickOnFootwear();
		fp.clickOnSneakers();
		sneakerPage.clickOnProduct();
		adiPage.clickOnProductImg();
	}

}
