package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testnglistenersdemo2 {

	@Test
	public void test5() {
		System.out.println("I am inside test 5");
	} 
	@Test
	public void test6() {
		System.out.println("I am inside test6");
		Assert.assertTrue(false);
	} 
	@Test
	public void test7() {
		System.out.println("I am inside test7");
		throw new SkipException("This test is skipped");
	} 

}
