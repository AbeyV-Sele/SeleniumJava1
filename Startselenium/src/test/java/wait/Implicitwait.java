package wait;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Implicitwait {
	public static void main(String[] args) {
		seleniumwait();

	}


	public  static void seleniumwait() {

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+ "/drivers/Chrome/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
	
		Driver.get("https://google.com/");
		Driver.findElement(By.name("q")).sendKeys("Automation step by step");
		WebDriverWait wait = new WebDriverWait(Driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='btnK']")));





		Driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);



	}

}
