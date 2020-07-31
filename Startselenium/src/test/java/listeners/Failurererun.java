package listeners;

import org.testng.annotations.Test;

public class Failurererun {


	@Test
	public void test1() {

		System.out.println("test 1");
	}

	@Test	(retryAnalyzer = listeners.retryanalyzer.class)
	public void test2() {

		System.out.println("test 2");
		int i= 4/0;
	}

	@Test
	public void test3() {

		System.out.println("test 3");
		int i= 4/0;
	}

}
