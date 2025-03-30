package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
	public static String Consent_button = "/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]/p";
	public static String Signup_Login_button = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a";
	public static String Signup_Login_name_text = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]";
	public static String Signup_Login_email_text = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]";
	public static String Sign_button = "//*[@id=\"form\"]/div/div/div[3]/div/form/button";

	public static void Open_the_chrome_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public static void Navigate_to_home_page()throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://www.automationexercise.com/");
	}
	public static void Click_Consent_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(Consent_button)).click();
	}
	public static void Click_Signup_Login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(Signup_Login_button)).click();
	}
	public static void Enter_the_name_and_email_address() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath(Signup_Login_name_text)).sendKeys("test");
		driver.findElement(By.xpath(Signup_Login_email_text)).sendKeys("test@test.com");
	}
	public static void click_signup_button() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath(Sign_button)).click();
	}
	public static void click_signup_button_on_login() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
}
