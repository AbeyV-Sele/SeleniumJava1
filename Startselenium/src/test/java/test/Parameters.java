package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameters {
	
	@Test
	@org.testng.annotations.Parameters("Myname")
	
	public void test(@Optional("poda") String Name ) {
		
		System.out.println("Name is:"  +Name);
	}
	
	

}
