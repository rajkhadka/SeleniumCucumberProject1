package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.CreateAccount;
import pageObjects.SignInSignOut;



public class CreateAccountSteps extends BaseClass  {
	
	
	@Given("User Launch chrome browser")
	public void user_Launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		createAccount = new CreateAccount(driver);
		
		
	  
	}

	@When("User open URL {string}")
	public void user_open_URL(String url) {
		driver.get(url);
		
	   
	}
	
	@Given("user clicks on My Account main tab")
	public void user_clicks_on_My_Account_main_tab() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();			
		
		createAccount.clickMyAccount();
		
		//topTabs.myAccountTopTab.click();
		
	   
	}

	@Then("user clicks on Create An Account")
	public void user_clicks_on_Create_An_Account() {
		createAccount.clickCreateAnAccount();
	    
	}

	@Then("user fills out all the fields {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_fills_out_all_the_fields(String firstName, String lastName, String email, String confirmEmail, String password, String confirmPassword) {
		createAccount.setFirstName(firstName);
		createAccount.setLastName(lastName);
		createAccount.setEmail(email);
		createAccount.setConfirmEmail(confirmEmail);
		createAccount.setCreatePassword(password);
		createAccount.setConfirmCreatePassword(confirmPassword);
		
	
	}

	@Then("user clicks on I agree to receive news and offers from Visionworks box")
	public void user_clicks_on_I_agree_to_receive_news_and_offers_from_Visionworks_box() {
		createAccount.clickAgree();
	    
	}

	@Then("user clicks on Check this box to show you understand the Terms of Use box")
	public void user_clicks_on_Check_this_box_to_show_you_understand_the_Terms_of_Use_box() {
		createAccount.clickPolicy();
	}

	@Then("user clicks on Agree & Create An Account Box")
	public void user_clicks_on_Agree_Create_An_Account_Box() {
		createAccount.clickAgreeCreateAnAccount();
	}
	
	
	//=========Steps to login in and login out
	

	@Then("user clicks on Sign In button")
	public void user_clicks_on_Sign_In_button() {
		
		signInSignOut = new SignInSignOut(driver);
		
	  
	}

	@Then("user enter valid email {string} and password {string}")
	public void user_enter_valid_email_and_password(String string, String string2) {
	    
	}

	@Then("user click on remember me")
	public void user_click_on_remember_me() {
	    
	}

	@Then("user click on SIGN IN button")
	public void user_click_on_SIGN_IN_button() {
	  
	}

	@Then("click on My Account and user can view SignOut button.")
	public void click_on_My_Account_and_user_can_view_SignOut_button() {
	 
	}

	@Then("user click on Sign Out.")
	public void user_click_on_Sign_Out() {
	   
	}

	@Then("close browser")
	public void close_browser() {
	  
	}


}
