package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Propertiesconfig;

public class Testng_and_Properties {

	WebDriver Driver = null;
	public static String browser =null;

	@BeforeTest
	public void setuptest() {
		Propertiesconfig.getproperties();
		@SuppressWarnings("unused")
		String projectpath = System.getProperty("user.dir");


		if(browser.equalsIgnoreCase("firefox")) {


			System.setProperty("webdriver.gecko.driver", projectpath +"/drivers/geckodriver/geckodriver.exe");
			Driver = new FirefoxDriver();



		}
		else if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/Chrome/chromedriver.exe");
			Driver = new ChromeDriver();

		}
	}

	@Test
	public void test() {
		Driver.get("https://www.opencart.com/index.php?route=account/login");
		Driver.findElement(By.id("input-email")).sendKeys("test");
		Driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();

	}
	@AfterTest
	public void aftertest() {
		System.out.println("Test is completed");
	}
}
