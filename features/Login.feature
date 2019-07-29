Feature: Free CRM Login Feature 

@CRM
Scenario: Free CRM Login Test 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters "abc" and "test@123" 
	Then user clicks on login button 
	Then user is on home page 
