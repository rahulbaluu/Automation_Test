package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


public class LoginPage extends BrowserDriver {
	public static String login_email_address = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]";
	public static String login_password = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]";
	public static String login_button = "//*[@id=\"form\"]/div/div/div[1]/div/form/button";
	public static void enter_the_name_and_email_address() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(login_email_address)).sendKeys("rahul@rah.com");
		driver.findElement(By.xpath(login_password)).sendKeys("rahul1234");
	}

	public static void click_login_button() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath(login_button)).click();
	}

	public static void click_signup_button_on_login() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
}
