package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent {
	public static void main(String[] args) throws IOException {
		
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	ExtentTest test = extent.createTest("My first Test", "Opening Chrome Browser");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");
	
	WebDriver  Driver = new FirefoxDriver();
	Driver.get("https://www.opencart.com/index.php?route=account/login");
	
	
	
	// log(Status, details)
    test.log(Status.INFO, "This step shows usage of log(status, details)");

    // info(details)
    test.info("This step shows usage of info(details)");
    
    // log with snapshot
    test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    

    // calling flush writes everything to the log file
    extent.flush();
    
	
	
	
	
	
	
	}
}
