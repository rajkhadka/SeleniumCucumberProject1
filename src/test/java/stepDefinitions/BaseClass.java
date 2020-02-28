package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.CreateAccount;
import pageObjects.SignInSignOut;

public class BaseClass {
	
	public WebDriver driver;
	public CreateAccount createAccount;
	public SignInSignOut signInSignOut;
	
	//Created for generating string for Unique email
	
	public static String randomestring() {
		
		String generatedString1 = RandomStringUtils.random(5);		
		return(generatedString1);
		
	}

}
