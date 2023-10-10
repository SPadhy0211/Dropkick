package Dropkick.TestScripts;

import org.testng.annotations.Test;

import GenericUtils.BaseClassDropkick;
import io.appium.java_client.AppiumBy;

public class AddToCart extends BaseClassDropkick {
	@Test
	public void addToCart() throws Throwable
	{
		sc.selectUAE();
		lan.selectEnglish();
		hp.clickOnShop();
		sp.clickOnFootwear();
		fp.clickOnSneakers();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Shoe']")).click();
		
		//scroll down to select size
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Size (EU)\"));"));
		driver.findElement(AppiumBy.className("android.widget.RelativeLayout")).click();
	
	}

}
