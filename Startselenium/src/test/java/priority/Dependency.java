package priority;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {

	@Test(dependsOnMethods = {"test49",})
	public static void test50() {
		System.out.println("test1");

	}

	@Test
	public static void test49() {
		System.out.println("test 2");

	}

	@Test
	@Ignore
	public static void test51() {
		System.out.println("test 3");

	}

}
