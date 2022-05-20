package utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	public static WebDriver driver;
	ConfigRead read;
	public static ExtentTest test;
	public static ExtentReports extent;
	public Snapshot snap;
	String path;
	
	
	@BeforeClass
		public static ExtentReports createReport() {
			//timeStamp="./reports";
			Date d=new Date();
			String date=new SimpleDateFormat("MM-dd-yy-HH-mm-ss").format(d);
			extent=new ExtentReports(System.getProperty("user.dir")+"./reports/rp"+date+".html",true);
		return extent;
		
		
	}
		
	public WebDriver setUp() {
		snap=new Snapshot();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Mavenms\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
		
	@AfterClass
	public void close() {
	       
			extent.endTest(test);
			extent.flush();
			driver.close();
	}

}
