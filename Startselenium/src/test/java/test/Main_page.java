package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_page {
	WebDriver Driver = null;
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");
			
			WebDriver  Driver = new FirefoxDriver();
			Driver.get("https://www.opencart.com/index.php?route=account/login");
			
			
			Login_Page mainobj = new Login_Page(Driver);
			
		mainobj.Login_Pag("test");
		mainobj.Button();
		
	}
	
	

}
