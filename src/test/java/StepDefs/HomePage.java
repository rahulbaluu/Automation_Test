package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.HomePage.*;

public class HomePage {
	@Given("Open the Chrome Browser")
	public static void Open_the_Chrome_Browser() throws InterruptedException {
		Open_the_chrome_browser();
	}
	@When("Navigate to home page")
	public void Navigate_to_Home_Page() throws InterruptedException {
		Navigate_to_home_page();
		Click_Consent_button();
	}

	@And("Click the  Signup Login")
	public void clickTheSignupLogin() throws InterruptedException {
		Click_Signup_Login();
	}

	@And("Enter the name and email address in the textbox")
	public void enterTheNameAndEmailAddressInTheTextbox() throws InterruptedException {
		Enter_the_name_and_email_address();
	}

	@And("Click the signup button")
	public void clickTheSignupButton() throws InterruptedException {
		click_signup_button();
	}

	@Then("Once landed to  Signup Registration page close the browser")
	public void onceLandedToSignupRegistrationPageCloseTheBrowser() throws InterruptedException {
		click_signup_button_on_login();
	}
}
