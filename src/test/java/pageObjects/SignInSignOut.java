package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInSignOut {
	
	private WebDriver ldriver;

	public SignInSignOut(WebDriver rdriver)   {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	//==========Web Element for sign in and sign out
	
	By primarySignInButton =By.xpath("//a[@class='btn primary signInButton']");
	
	By emailForSignIn = By.xpath("userlogin");
	
	By passwordForSignIn = By.xpath("//input[@placeholder='Password']");	
	
	By rememberMeButton =By.xpath("//input[@name='rememberMe']']");
	
	By signInButtonAfterTypingEmailAndPassword = By.id("//submitLogin");
	
	By logOut = By.xpath("//a[@class='jq_logout']");
	
	/*
	 * will be changing to By instead of WebElement
	 * 
	@FindBy (xpath ="//a[@class='btn primary signInButton']")
	public WebElement primarySignInButton;
	
	@FindBy (xpath = "userlogin")
	public WebElement emailForSignIn;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	public WebElement passwordForSignIn;
	
	@FindBy (xpath = "//input[@name='rememberMe']")
	public WebElement rememberMeButton;	
	
	@FindBy (id = "//submitLogin")
	public WebElement signInButtonAfterTypingEmailAndPassword;
	
	@FindBy(xpath="//a[@class='jq_logout']")
	public WebElement logOut;
	
	*/
	
	//-------we might get an issue
	
	@FindBy (xpath = "//a[@class='text-book text-underline text-color']")
	public WebElement forgotPassword;
	
	//==========Sign In Action methods=========
	/*
		public void clickPrimarySignIn() {		
			primarySignInButton.click();
			
		}
		public void setUserLogin() {		
			emailForSignIn.clear();
			emailForSignIn.sendKeys("rajkha375@gmail.com");
			
		}
		
		public void setUserPassword(String password) {		
			passwordForSignIn.clear();
			passwordForSignIn.sendKeys("password");
			
		}
		
		public void clickRememberMe() {		
			rememberMeButton.click();
			
		}
		
		public void clickSignIn() {		
			signInButtonAfterTypingEmailAndPassword.click();
			
		}
		
		public void clicklogOut() {		
			logOut.click();
			
		}
		
		*/
		
		//===========Sign In Action Methods========
	
	public void clickPrimarySignIn() {
		ldriver.findElement(primarySignInButton).click();
	}
	
	public void setUserLogin(String email) {
		ldriver.findElement(emailForSignIn).sendKeys(email);
	}
	
	public void setUserPassworing (String password) {
		ldriver.findElement(passwordForSignIn).sendKeys(password);
				
	}
	
	public void clickRememberMe() {
		ldriver.findElement(rememberMeButton).click();
	}
	public void clickSignIn() {
		ldriver.findElement(signInButtonAfterTypingEmailAndPassword).click();
	}
	
	public void clickLogOut() {
		//ldriver.findElement(logOut).click();
		
		//If the click() does not work we have to use JavascriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", logOut);
 	}

}
