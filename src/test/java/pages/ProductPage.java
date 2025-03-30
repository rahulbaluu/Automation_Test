package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class ProductPage extends BrowserDriver {
	public static String product_icon = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a";
	public static String view_product_icon = "//a[@href=\"/product_details/1\"]";
	public static String check_Category = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]";
	public static String check_Product_Name = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2";
	public static String check_Availability = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b";
	public static String check_Condition = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b";
	public static String check_Brand = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b";

	public static void click_Product_Icon() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(product_icon)).click();
	}

	public static void click_View_Product_Icon() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(view_product_icon)).click();
	}

	public static void click_Check_Category() throws InterruptedException {
		Thread.sleep(2000);
		String product_icon = driver.findElement(By.xpath(check_Category)).getText();
		assertEquals ("Category: Women > Tops", product_icon);
	}

	public static void click_Check_Product_Name() throws InterruptedException {
		Thread.sleep(2000);
		String click_Check_Product_Name = driver.findElement(By.xpath(check_Product_Name)).getText();
		assertEquals ("Blue Top", click_Check_Product_Name);
	}

	public static void click_Check_Availability() throws InterruptedException {
		Thread.sleep(2000);
		String click_Check_Availability = driver.findElement(By.xpath(check_Availability)).getText();
		assertEquals ("Availability", click_Check_Availability);
	}

	public static void click_Check_Condition() throws InterruptedException {
		Thread.sleep(2000);
		String click_Check_Condition = driver.findElement(By.xpath(check_Condition)).getText();
		assertEquals ("Condition", click_Check_Condition);
	}

	public static void click_Check_Brand() throws InterruptedException {
		Thread.sleep(2000);
		String click_Check_Brand = driver.findElement(By.xpath(check_Brand)).getText();
		assertEquals ("Brand", click_Check_Brand);
	}

	public static void click_Back() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
