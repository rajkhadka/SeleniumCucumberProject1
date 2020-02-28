Feature: Sign In and Sign Out
@LogInLogOut
Scenario: User must be sign in with valid credentials

Given User Launch chrome browser
	#When User open URL "https://www.visionworks.com/"
	#Given user clicks on My Account main tab 
	Then user clicks on Sign In button
	Then user enter valid email "rajkha375@gmail.com" and password "Works$123"
	Then user click on remember me
	Then user click on SIGN IN button
	Then click on My Account and user can view SignOut button.
	Then user click on Sign Out.
	And close browser
	
		
	
	
	
	
	
	
	
	
	
		
