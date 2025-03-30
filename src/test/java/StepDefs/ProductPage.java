package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.ProductPage.*;

public class ProductPage {
	@When("Click Products icon in the home page")
	public void clickProductsIcon() throws InterruptedException {
		click_Product_Icon();
	}
	@And("Verify all product is displayed")
	public void verifyAllProductIsDisplayed() throws InterruptedException {
		click_View_Product_Icon();
	}
	@And("Click on 'View Product' of first product")
	public void clickOnViewProduct() throws InterruptedException {
		click_Check_Category();
	}
	@And("Once landed verify that detail is visible \\(product name, category, price, availability, condition, brand)")
	public void verifyThatDetailIsVisible() throws InterruptedException {
		click_Check_Product_Name();
		click_Check_Availability();
		click_Check_Condition();
		click_Check_Brand();
	}

	@Then("Close the browser once completed")
	public void closeTheBrowserOnceCompleted() throws InterruptedException {
		click_Back();
	}
}
