package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPageTest;


public class LoginPage {
	LoginPageTest loginPageTest = new LoginPageTest();

	@And("Enter the Login details")
	public void enterLoginDetails() {
		loginPageTest.enter_the_name_and_email_address();
	}

	@And("Click the login button")
	public void clickTheLoginButton() {
		loginPageTest.click_login_button();
	}

	@Then("Check user can login to the home page")
	public void checkUserCanLoginToTheHomePage() {
		loginPageTest.click_signup_button_on_login();
	}
}
