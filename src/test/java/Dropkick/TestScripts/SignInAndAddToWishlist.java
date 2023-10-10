package Dropkick.TestScripts;

import org.testng.annotations.Test;

import GenericUtils.BaseClassDropkick;
import io.appium.java_client.AppiumBy;

public class SignInAndAddToWishlist extends BaseClassDropkick {
	
	@Test
	public void addToWishlist() throws Throwable
	{
		sc.selectUAE();
		lan.selectEnglish();
		hp.clickOnAccount();
		accPage.clickOnSignIn();
		signin.enterSignInDetails();
		
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Email Address*']//following-sibling::android.widget.RelativeLayout//"
//				+ "android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")).sendKeys("467sasmita@gmail.com");
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Password*']/following-sibling::android.widget.RelativeLayout//"
//				+ "android.widget.EditText[@resource-id='com.dropkick.android:id/textInput']")).sendKeys("Sasmita@123");
		
		
		
	}

}