Feature: Create An Account


Scenario: User create an account
	Given User Launch chrome browser
	When User open URL "https://www.visionworks.com/"
	Given user clicks on My Account main tab 
	Then user clicks on Create An Account
	Then user fills out all the fields "<firstName>" , "<lastName>" , "<email>" , "<confirmEmail>" , "<password>" , "<confirmPassword>" 
	Then user clicks on I agree to receive news and offers from Visionworks box
	Then user clicks on Check this box to show you understand the Terms of Use box
	Then user clicks on Agree & Create An Account Box
	
	
Scenario Outline: User create an account Data Driven
	Given User Launch chrome browser
	When User open URL "https://www.visionworks.com/"
	Given user clicks on My Account main tab 
	Then user clicks on Create An Account
	Then user fills out all the fields "<firstName>" , "<lastName>" , "<email>" , "<confirmEmail>" , "<password>" , "<confirmPassword>" 
	Then user clicks on I agree to receive news and offers from Visionworks box
	Then user clicks on Check this box to show you understand the Terms of Use box
	Then user clicks on Agree & Create An Account Box
	
	 Examples:
	 |firstName      | |lastName    | |email                  | |confirmEmail            | |password       | |confirmPassword|
	 |Ras            | |Khas        | |123@gmail.com    	  | |123@gmail.com     		 | |Works$234      | |Works$234		 |
	 |test         	 | |test1     	| |345@gmail.com    	  | |345@gmail.com     		 | |Works$345      | |Works$345		 |
	  


	 
