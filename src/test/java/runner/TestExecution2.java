package runner;


	import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageobject.HomePage2;
import reusable.WebDriverHelper;
	import utility.BaseClass;
	import utility.ConfigRead;
	
	import utility.Snapshot;



	public class TestExecution2 extends BaseClass {
		public ConfigRead read;
		public  ExtentReports extent;
		Snapshot snap;
		public WebDriverHelper helper;
		public static ExtentTest test;
		@Test
		public void basePageNavigation() throws InterruptedException {
			read=new ConfigRead();
			//extent =new ExtentReport();
			driver=setUp();
			driver.get(read.getUrl());
			HomePage2 h=new HomePage2(driver);
			 extent=createReport();
				//test=new ExtentTest();
		   	test=extent.startTest("TestExecution2");
			test.assignAuthor("anuja shelke");
				snap=new Snapshot();
				test.log(LogStatus.PASS,"successfully passed");
				
				//test=extent.createTest("home page 2");
				snap=new Snapshot();
				test.log(LogStatus.PASS,"successfully launched");
			Thread.sleep(3000);
			h.closePopUp();
			Thread.sleep(3000);
			h.hoverOnText();
			Thread.sleep(3000);
			h.clickOnLink();
			Thread.sleep(3000);
			h.textContain();
			
		}
		
		
		
	
	}


