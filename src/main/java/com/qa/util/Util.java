package com.qa.util;






import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;

import com.qa.testbase.TestBase;		


public class Util extends TestBase implements ITestListener  {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {	
		String fileName= result.getMethod().getMethodName();
		String filePath= "C:\\Users\\HH\\eclipse-workspace\\POMProject\\"+fileName+".png";
		try {
			ScreenShot.ScreenShotUtility(driver, filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
	
