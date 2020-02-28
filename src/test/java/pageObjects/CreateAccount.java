package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	private WebDriver ldriver;

	public CreateAccount(WebDriver rdriver)   {
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath = "//a[@id='dtAccount']")
	public WebElement myAccount;
	
	@FindBy (xpath = "//a[@class='text-underline createAnAccount']")
	public WebElement createAnAccount;
	
	@FindBy (xpath = "//input[@name='firstName']")
	public WebElement EnterFirstName;
	
	@FindBy (xpath = "//input[@name='lastName']")
	public WebElement EnterLastName;
	
	@FindBy (xpath = "//input[@name='email']")
	public WebElement emailAddress;
	
	@FindBy (xpath = "//input[@id='confirmEmail']")
	public WebElement confirmEmailAddress;
	
	@FindBy (xpath = "//input[@id='registerPassword']")
	public WebElement registerPassword;
	
	@FindBy (xpath = "//input[@id='confirmPassword']")
	public WebElement passwordConfirmPassword;
	
	@FindBy (xpath = "//input[@name='agree']")
	public WebElement agree;
	
	@FindBy (xpath = "//input[@name='registerAgreePolicy']")
	public WebElement registerAgreePolicy;
	
	@FindBy (xpath = "//input[@id='submitRegister']")
	public WebElement submitRegister;
	

	
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void clickCreateAnAccount() {
		createAnAccount.click();
		
	}
	
	public void setFirstName (String firstName) {
		EnterFirstName.clear();
		EnterFirstName.sendKeys(firstName);
		
	}
	
	public void setLastName (String lastName) {
		EnterLastName.clear();
		EnterLastName.sendKeys(lastName);
		
	}
	
	public void setEmail (String email ) {
		emailAddress.clear();
		emailAddress.sendKeys(email);
		
	}
	
	public void setConfirmEmail (String confirmEmail) {
		confirmEmailAddress.clear();
		confirmEmailAddress.sendKeys(confirmEmail);
		
	}
	
	public void setCreatePassword (String password) {
		registerPassword.clear();
		registerPassword.sendKeys(password);
		
	}
	
	public void setConfirmCreatePassword(String confirmPassword) {
		passwordConfirmPassword.clear();
		passwordConfirmPassword.sendKeys(confirmPassword);
		
	}
	
	public void clickAgree() {
		//agree.clear();
		agree.click();
		
	}
	
	public void clickPolicy() {
	
		registerAgreePolicy.click();
		
	}
	
	public void clickAgreeCreateAnAccount() {		
		submitRegister.click();
		
	}
	
	


}
