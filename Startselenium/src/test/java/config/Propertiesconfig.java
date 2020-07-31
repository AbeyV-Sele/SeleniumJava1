package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import util.Testng_and_Properties;

public class Propertiesconfig {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getproperties();
		setproperties();

	}
	public static void getproperties() {
		try {


			InputStream input = new FileInputStream(projectpath+"/src/test/java/config/conig.properties");
			prop.load(input);
			String Browser = prop.getProperty("browser");
			System.out.println(Browser);
			Testng_and_Properties.browser=Browser;
		}
		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();

		}
	}
	public static void setproperties() {

		try {
			OutputStream output = new FileOutputStream(projectpath+"/src/test/java/config/conig.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		}
		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();

		}
	}
}


