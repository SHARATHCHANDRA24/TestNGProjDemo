package comTestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ReportingDemo implements ITestListener{
  @Test
  public void methodTest() {
  }

@Override
public void onTestStart(ITestResult result) {
	System.out.println("Test Started"+result.getName());
	
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("test case success: "+result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("test failure: "+result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("test skipped: "+result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
}

@Override
public void onStart(ITestContext context) {
	System.out.println("test case statrted: "+context.getName());
	
}

@Override
public void onFinish(ITestContext context) {
	System.out.println("end of execution: "+context.getName());
}
}
