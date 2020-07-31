


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import test.Webpage;

import org.openqa.selenium.firefox.FirefoxDriver;




public class Seln {
	
	public static void main(String[] args) {
		googlesearch();
		
	}
	public static void googlesearch ()
	{
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");
		
		WebDriver  Driver = new FirefoxDriver();
		Driver.get("https://opencart.abstracta.us/index.php?route=account/login");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\ drivers\\Chrome\\chromedriver.exe");
		//WebDriver  driver = new ChromeDriver();
Webpage.Email_address(Driver).sendKeys("test");
Webpage.Button(Driver).click();

		//System.setProperty("webdriver.ie.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\IEdriver\\IEDriverServer.exe");
		//WebDriver  driver = new InternetExplorerDriver();
		//driver.get("https://www.google.com/");"
	
	}
}
	
