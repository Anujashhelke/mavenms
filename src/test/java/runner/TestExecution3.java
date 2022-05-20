package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageobject.HomePage3;
import reusable.WebDriverHelper;
import utility.BaseClass;
import utility.ConfigRead;

import utility.Logs;
import utility.Snapshot;


	public class TestExecution3 extends BaseClass {
		public ConfigRead read;
		public static ExtentReports extent;
		Snapshot snap;
		public WebDriverHelper helper;
	    public static ExtentTest test;
		public Logs log;
		@Test
		public void basePageNavigation() throws InterruptedException {
			read=new ConfigRead();
			//extent =new ExtentReport();
			driver=setUp();
			driver.get(read.getUrl());
			HomePage3 h=new HomePage3(driver);
			 extent=createReport();
				//test=new ExtentTest();
		   	test=extent.startTest("TestExecution2");
			test.assignAuthor("anuja shelke");
				snap=new Snapshot();
				test.log(LogStatus.PASS,"successfully passed");
			// extent.createReport();
				//extent.createTest("start test3");
				snap=new Snapshot();
				test.log(LogStatus.PASS,"successfully launched");
			Thread.sleep(3000);
			h.closePopUp();
			Thread.sleep(3000);
			h.clickOnLink();
			Thread.sleep(3000);
			h.clickOnLink();
			Thread.sleep(3000);
			h.textContain();
			//extent.endReport();			
		}
	
	

	}


