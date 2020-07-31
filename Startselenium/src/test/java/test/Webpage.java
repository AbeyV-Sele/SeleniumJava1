package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webpage {
	
	public static WebElement Element = null;
	
	
	public static WebElement Email_address(WebDriver Driver)	{
		
		Element = Driver.findElement(By.id("input-email"));
		return Element;
		
		
	}	

	public static WebElement Button(WebDriver Driver)	{
		
		Element = Driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		return Element;
		
		
	}	
					
			

}
