package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Headless {

	public static void main(String[] args) {
		test();
	}





	public static void test() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver" ,  projectpath+ "/drivers/Chrome/chromedriver.exe");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver Driver = new ChromeDriver(options);
		Driver.get("https://google.com/");
		Driver.findElement(By.name("q")).sendKeys("Automation step by step");
		System.out.println("Test is completed");

	}
}
