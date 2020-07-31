package priority;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = {"sanity"} )
	public void test1() {
		System.out.println("Test 1");

	}
	@Test(groups = {"sanity","smoke"} )
	public void test2() {
		System.out.println("Test 2");

	}
	@Test(groups = {"regression"} )
	public void test3() {
		System.out.println("Test 3");

	}
	@Test(groups = {"regression","general"} )
	public void test4() {
		System.out.println("Test 4");

	}
}
