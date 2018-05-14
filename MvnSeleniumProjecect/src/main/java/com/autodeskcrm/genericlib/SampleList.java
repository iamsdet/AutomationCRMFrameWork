package com.autodeskcrm.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleList implements ITestListener{
	public void onTestFailure(ITestResult r) {
		
		  String faildTestNAme = r.getMethod().getMethodName();
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.driver);
		
		File srcfile = edriver.getScreenshotAs(OutputType.FILE);
	
		File dstFile = new File(".\\screenShot\\"+faildTestNAme+".png");
		try {
			FileUtils.copyFile(srcfile, dstFile);
		                              } catch (IOException e) {}
		
	}
	
	
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}



	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
