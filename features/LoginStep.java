package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	@Before
	public void launchBrowser(){
		System.out.println("Launch browser");
	}
	@After
	public void closeeBrowser(){
		System.out.println("Close browser");
	}

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	 System.out.println("user was on login page");  
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	   System.out.println("verify title of the page");
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		  System.out.println("enter credentails"+arg1 +"\t"+arg2);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		  System.out.println("user clickon login functionality");
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		  System.out.println("validate displaying of home page");
	}
}
