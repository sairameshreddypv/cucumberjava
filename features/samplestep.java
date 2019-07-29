package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class samplestep {
	
	@Given("^I am on career\\.guru(\\d+)\\.com$")
	public void i_am_on_career_guru_com(int arg1) throws Throwable {
	    System.out.println("I am on career.guru99.com");
	}

	@When("^I click on career guide menu$")
	public void i_click_on_career_guide_menu() throws Throwable {
		 System.out.println("I click on career guide menu");
	}

	@Then("^I should see career guide page$")
	public void i_should_see_career_guide_page() throws Throwable {
		 System.out.println("I should see career guide page");
	}

}
