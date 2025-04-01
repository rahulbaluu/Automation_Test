package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import utility.BrowserDriver;
import java.time.Duration;

public class HomePageTest extends BrowserDriver {
	private static final String Consent_button = "/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]/p";
	private static final String Signup_Login_button = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a";
	public static final String Signup_Login_name_text = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]";
	public static final String Signup_Login_email_text = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]";
	public static final String Sign_button = "//*[@id=\"form\"]/div/div/div[3]/div/form/button";

	private WebDriverWait wait;
	@BeforeClass
	public void Open_the_chrome_browser(){
		if (BrowserDriver.driver == null) {
			BrowserDriver.initializeDriver();
		}
	}

	@Test(priority = 1)
	public void Navigate_to_home_page(){
		System.out.println("Navigate to home");
	}
	@Test(priority = 2)
	public void Click_Consent_button() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Consent_button))).click();
	}
	@Test(priority = 3)
	public void Click_Signup_Login(){
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Signup_Login_button))).click();
	}
	@Test(priority = 4)
	public void Enter_the_name_and_email_address(){
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Signup_Login_name_text))).sendKeys("test");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Signup_Login_email_text))).sendKeys("test@test.com");
	}
	@Test(priority = 5)
	public void click_signup_button(){
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sign_button))).click();
	}
	@Test(priority = 6)
	public void click_signup_button_on_login(){
		driver.navigate().back();
	}
}
