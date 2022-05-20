package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import reusable.WebDriverHelper;
import uistore.Home2Ui;
//import utility.ExtentReport;
import utility.Logs;

public class HomePage2 {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	 Logger log;
		
		//public ExtentReport extent;
	
		public HomePage2(WebDriver driver) {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			// extent=new ExtentReport();
		}
	


	public void hoverOnText() {
		helper.action(Home2Ui.hover);
		log.info("hover successfully");
		
		
	}

	public void closePopUp() {
		helper.click(Home2Ui.popUp);
		log.debug("closed ");
		
	}

	public void clickOnLink() {
		helper.click(Home2Ui.text);
		log.info("clicked on link");
		
	}

	public void textContain() {
		helper.containsText();
		log.debug("verified successfully");
		
	}

}
