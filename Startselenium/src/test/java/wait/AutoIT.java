package wait;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}

	
	
	
	public static void test() throws IOException, InterruptedException {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chrome/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://tinyupload.com/");
		Driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("E:\\Selenium\\sample.exe");
		Thread.sleep(6000);
		
		
		
		
	}
}
