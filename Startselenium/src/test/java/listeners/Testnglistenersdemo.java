package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testnglistenersdemo {

	@Test
	public void test1() {
		System.out.println("I am inside test1");
	} 
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		Assert.assertTrue(false);
	} 
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("This test is skipped");
	} 

}
