package test;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import test.Webpage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Seln {

	static WebDriver Driver = null;

	@BeforeTest
	public static void btest () {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");

		WebDriver  Driver = new FirefoxDriver();
		Driver.get("https://www.opencart.com/index.php?route=account/login");

	}


	@Test
	public static void googlesearch ()
	{
		Driver.get("https://www.opencart.com/index.php?route=account/login");


		Driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();



	}

	@AfterTest
	public static void atest () {
		Driver.close();
		System.out.println("Test is Completed");

	}
}
	
