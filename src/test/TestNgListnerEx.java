package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListnerEx implements ITestListener {
	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) throws NullPointerException {
		// TODO Auto-generated method stub
		WebDriver driver = BaseClass.driver;
		TakesScreenshot tsObj = (TakesScreenshot)driver;
		
		File myFile = tsObj.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(myFile, new File("Test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
}
