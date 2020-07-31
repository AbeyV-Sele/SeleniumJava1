package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	
	static Logger logs = LogManager.getLogger(Demo1.class);
	
	public static void main(String[] args) {
		System.out.println("Tesing log4j");
		
		logs.info("scni");
		logs.error("This is an error message");
		logs.warn("This is an warning message");
		logs.fatal("This is an fatal message");
				
	}
	

}
