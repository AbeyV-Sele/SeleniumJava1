package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testnglisteners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("******Test on start" +result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("******Test on sucess" +result.getName());
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("******Test on faliure" +result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("******Test on skip" +result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		System.out.println("******Test on finish" +context.getName());

	}

}
