package Dropkick.TestScripts;

import org.testng.annotations.Test;

import GenericUtils.BaseClassDropkick;

public class CustomerRegistrationTest extends BaseClassDropkick {
	
	@Test
	public void registration() throws Throwable
	{
		sc.selectUAE();
		lan.selectEnglish();
		hp.clickOnAccount();
		accPage.clickOnRegister();
		signup.enterSignUpDetails();
		
	}

}
