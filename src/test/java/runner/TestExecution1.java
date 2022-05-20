package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageobject.Homepage;
import reusable.WebDriverHelper;
import utility.BaseClass;
import utility.ConfigRead;

import utility.Snapshot;



public class TestExecution1 extends BaseClass {
	public ConfigRead read;
	public static ExtentReports extent;
	
	
	ExtentTest test;
	
	Snapshot snap;
	String path;
	public WebDriverHelper helper;
	@Test
	public void basePageNavigation() throws InterruptedException, IOException {
		read=new ConfigRead();
		//extent =new ExtentReport();
		driver=setUp();
		driver.get(read.getUrl());
		Homepage h=new Homepage(driver);
       extent=createReport();
		//test=new ExtentTest();
   	test=extent.startTest("TestExecution1");
	test.assignAuthor("anuja shelke");
		snap=new Snapshot();
		test.log(LogStatus.PASS,"successfully passed");
		
		Thread.sleep(3000);
		//h.closePopUp();
		Thread.sleep(3000);
		
		h.clickOnSearch();
		test.log(LogStatus.PASS, "clicked successfully", path);
		Thread.sleep(3000);
		h.sendText("car");
		//extent.logPass("text sended successfully");
		Thread.sleep(3000);
		h.clickOnSearch2();
		//extent.logPass("clicked on search successfully");
		path=snap.takeSnapshot(driver);
		//extent.logPass(path);
		h.textContain();
		
	}
	
}
	
	


