package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BrowserDriver;
import java.time.Duration;

public class LoginPageTest extends BrowserDriver {
	private static final String login_email_address = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]";
	private static final String login_password = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]";
	private static final String login_button = "//*[@id=\"form\"]/div/div/div[1]/div/form/button";
	private WebDriverWait wait;

	@BeforeClass
	public void setUp(){
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void enter_the_name_and_email_address(){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_email_address))).sendKeys("rahul@rah.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_password))).sendKeys("rahul1234");
	}
	@Test(priority = 2)
	public void click_login_button(){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(login_button))).click();
	}
	@Test(priority = 3)
	public void click_signup_button_on_login(){
		driver.navigate().back();
	}
}
