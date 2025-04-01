package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BrowserDriver;
import java.time.Duration;

import static org.junit.Assert.assertEquals;


public class ProductPageTest extends BrowserDriver {
	private static final String product_icon = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a";
	private static final String view_product_icon = "//a[@href=\"/product_details/1\"]";
	private static final String check_Category = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]";
	private static final String check_Product_Name = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2";
	private static final String check_Availability = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b";
	private static final String check_Condition = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b";
	private static final String check_Brand = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b";

	private WebDriverWait wait;

	@BeforeClass
	public void setUp(){
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void click_Product_Icon(){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(product_icon))).click();
	}
	@Test(priority = 2)
	public void click_View_Product_Icon(){
		WebElement productLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(view_product_icon)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productLink);
		productLink.click();
	}
	@Test(priority = 3)
	public void click_Check_Category(){
		String product_icon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(check_Category))).getText();
		assertEquals ("Category: Women > Tops", product_icon);
		System.out.println("Category: " + product_icon);
	}
	@Test(priority = 4)
	public void click_Check_Product_Name(){
		String click_Check_Product_Name =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(check_Product_Name))).getText();
		assertEquals ("Blue Top", click_Check_Product_Name);
		System.out.println(" Verified Product Name: " + click_Check_Product_Name);
	}
	@Test(priority = 5)
	public void click_Check_Availability(){
		String click_Check_Availability = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(check_Availability))).getText();
		assertEquals ("Availability:", click_Check_Availability);
		System.out.println("Verified Availability:" + click_Check_Availability);
	}
	@Test(priority = 6)
	public void click_Check_Condition(){
		String click_Check_Condition = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(check_Condition))).getText();
		assertEquals ("Condition:", click_Check_Condition);
		System.out.println("Verified Condition:" + click_Check_Condition);
	}
	@Test(priority = 7)
	public void click_Check_Brand(){
		String click_Check_Brand = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(check_Brand))).getText();
		assertEquals ("Brand:", click_Check_Brand);
		System.out.println("Verified Brand:" + click_Check_Brand);
	}
	@Test(priority = 8)
	public void click_Back() {
		driver.quit();
	}
}
