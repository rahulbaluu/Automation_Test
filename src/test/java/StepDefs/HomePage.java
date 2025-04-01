package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageTest;

public class HomePage {
	HomePageTest homePageTest = new HomePageTest();
	@Given("Open the Chrome Browser")
	public void Open_the_Chrome_Browser(){
		homePageTest.Open_the_chrome_browser();
	}
	@When("Navigate to home page")
	public void Navigate_to_Home_Page(){
		homePageTest.Navigate_to_home_page();
		homePageTest.Click_Consent_button();
	}

	@And("Click the  Signup Login")
	public void clickTheSignupLogin(){
		homePageTest.Click_Signup_Login();
	}

	@And("Enter the name and email address in the textbox")
	public void enterTheNameAndEmailAddressInTheTextbox(){
		homePageTest.Enter_the_name_and_email_address();
	}

	@And("Click the signup button")
	public void clickTheSignupButton(){
		homePageTest.click_signup_button();
	}

	@Then("Once landed to  Signup Registration page close the browser")
	public void onceLandedToSignupRegistrationPageCloseTheBrowser(){
		homePageTest.click_signup_button_on_login();
	}
}
