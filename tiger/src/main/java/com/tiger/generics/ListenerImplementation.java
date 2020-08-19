package com.tiger.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerImplementation extends Baseclass implements ITestListener {
	public void onTestFailure (ITestResult result) {
	  String TestCaseName = result.getName();
	  TakesScreenshot t=(TakesScreenshot) dr;
	  File src = t.getScreenshotAs(OutputType.FILE);
	  File dest=new File("./ScreenShot/"+TestCaseName+".png");
	  try {
	   FileUtils.copyFile(src, dest);
	  } catch (IOException e) {
	   
	   e.printStackTrace();
	  }
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


	