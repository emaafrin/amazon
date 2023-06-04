package steps;

import org.openqa.selenium.WebDriver;

import Common.AmazonBase;
import Pages.amazonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginToAmazonAccount extends AmazonBase {
	amazonPage ap;


	@Given("i am on the amazon page")
	public void i_am_on_the_amazon_page() {
	    
		
	}

	@When("i click on the sign in button")
	public void i_click_on_the_sign_in_button() {
	   
	}

	@When("I enter the {string} in user name input field")
	public void i_enter_the_in_user_name_input_field(String string) {
	    
		
	}

	@When("I enter the {string} in password input field")
	public void i_enter_the_in_password_input_field(String string) {
	    
		
	}

	@Then("i can successfully login to my amazon account")
	public void i_can_successfully_login_to_my_amazon_account() {
	   
		
	}


}