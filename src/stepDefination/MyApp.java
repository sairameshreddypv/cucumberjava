package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyApp {
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.out.println("open chrome and start app");
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		System.out.println("user enter valid details");
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    System.out.println("user should login into the page");
	}



}
