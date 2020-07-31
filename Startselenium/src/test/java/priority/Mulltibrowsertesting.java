package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mulltibrowsertesting {

	WebDriver Driver = null;
	String projectpath = System.getProperty("user.dir");

	@Parameters("BrowserName")
	@BeforeTest
	public void setuptest(String BrowserName) {



		if(BrowserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");

		
			  Driver= new FirefoxDriver();
		}

		else if(BrowserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", projectpath+ "/drivers/Chrome/chromedriver.exe");

			
			Driver = new ChromeDriver();
		}
	} 

	@Test
	public void test1() throws Exception {

		Driver.get("https://opencart.abstracta.us/index.php?route=account/login");
		Driver.findElement(By.id("input-email")).sendKeys("test");
		
	}

}
