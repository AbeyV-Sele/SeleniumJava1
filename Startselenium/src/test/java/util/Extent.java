package util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent {
	WebDriver Driver = null;

	public static void main(String[] args) throws IOException {


		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\drivers\\geckodriver\\geckodriver.exe");

		WebDriver  Driver = new FirefoxDriver();
		Driver.get("https://opencart.abstracta.us/index.php?route=account/login");
		test.log(Status.INFO, "This step shows usage of log(status, details)");


		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());





		test.addScreenCaptureFromPath("screenshot.png");
		extent.flush();


	}
}
