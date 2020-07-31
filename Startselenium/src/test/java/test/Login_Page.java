package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	By Login_Pag = By.id("input-email");
	By Button = By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']");

	WebDriver Driver = null;

	public Login_Page(WebDriver Driver)

	{
		this.Driver = Driver	;

	}

	public void Login_Pag(String text) {

		Driver.findElement(Login_Pag).sendKeys(text);


	}
	public void Button() 
	{

		Driver.findElement(Button).click();


	}

}
