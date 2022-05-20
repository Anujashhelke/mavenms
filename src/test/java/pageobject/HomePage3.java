package pageobject;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.Home3Ui;
//import utility.ExtentReport;
import utility.Logs;

public class HomePage3 {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	public Logs logUtil;
	public Logger log;
		
	//	public ExtentReport extent;
	
		public HomePage3(WebDriver driver) {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			 //extent=new ExtentReport();
			 
		}



	public void closePopUp() {
		helper.click(Home3Ui.popUp);
		log.info("closed successfully");
		
	}



	public void clickOnLink() {
		helper.click(Home3Ui.footer);
		log.debug("clicked successfully");
		
	}



	public void textContain() {
		helper.getText(Home3Ui.text);
		log.debug("verified text");
		
	}
	

}
