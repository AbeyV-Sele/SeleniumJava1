package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");

		WebDriver  Driver = new FirefoxDriver();
		Driver.get("https://google.com/");
		Driver.findElement(By.name("q")).sendKeys("Automation step by step");





		Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver Driver) {
				return Driver.findElement(By.name("btnk"));


			}
		});


	}
}
