package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class First {

	@Given("^user on login page$")
	public void user_on_login_page() throws Throwable {
		System.out.println("user on login");
	}

	@When("^user enter username as \"([^\"]*)\" password as \"([^\"]*)\"$")
	public void user_enter_username_as_password_as(String arg1, String arg2) throws Throwable {
	
		System.out.println("user enter username as:"+arg1);
		System.out.println("user enter username as:"+arg2);
		
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
	    System.out.println("user click on submit button");
	}
}
