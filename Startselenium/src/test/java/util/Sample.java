package util;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.Webpage;

public class Sample {
	public static void main(String[] args) {
		googlesearch();

	}
	public static void googlesearch ()
	{


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");

		WebDriver  Driver = new FirefoxDriver();
		Driver.get("https://opencart.abstracta.us/index.php?route=account/login");
		Driver.findElement(By.id("input-email")).sendKeys("Test");
		Driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

		List<WebElement> listofinputelements = Driver.findElements(By.id("input-email"));
		int count = listofinputelements.size();

		System.out.println(count);




	}




}
