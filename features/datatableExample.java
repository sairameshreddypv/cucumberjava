package StepDefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class datatableExample {

	
		@When("^User enters Credentials to LogIn$")
		public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {

			//Write the code to handle Data Table
			List<List<String>> data = usercredentials.raw();
			

			//This is to get the first data of the set (First Row + First Column)
			//driver.findElement(By.id("log")).sendKeys(); 
			System.out.println(data.get(0).get(0));

			//This is to get the first data of the set (First Row + Second Column)
		   // driver.findElement(By.id("pwd")).sendKeys();
		    System.out.println(data.get(0).get(1));

		   // driver.findElement(By.id("login")).click();
		}
		
		@When("^User enters Credentials to LogIn$")
		public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {

			//Write the code to handle Data Table
			for (Credentials credentials : usercredentials) {			
				// driver.findElement(By.id("log")).sendKeys(credentials.getUsername()); 
			    // driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
			   //  driver.findElement(By.id("login")).click();
				}		
		}
}
