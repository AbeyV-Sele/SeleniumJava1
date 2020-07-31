package util;

import java.io.IOException;

public class New1 {
	static String projectpath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
	

	
	Fetch exc = null;
	try {
		exc = new Fetch(projectpath+ "/Excel/Book1.xlsx","Sheet1");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	exc.getcelldata(0, 0);
	
	}

}
