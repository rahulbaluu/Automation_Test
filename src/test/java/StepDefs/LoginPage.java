package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static pages.LoginPage.*;

public class LoginPage {
	@And("Enter the Login details")
	public void enterLoginDetails() throws InterruptedException {
		enter_the_name_and_email_address();
	}

	@And("Click the login button")
	public void clickTheLoginButton() throws InterruptedException {
		click_login_button();
	}

	@Then("Check user can login to the home page")
	public void checkUserCanLoginToTheHomePage() throws InterruptedException {
		click_signup_button_on_login();
	}
}
