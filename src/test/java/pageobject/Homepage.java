package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import reusable.WebDriverHelper;
//import utility.ExtentReport;
import uistore.HomeUi;
import utility.Logs;

public class Homepage {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	Logger log;
	
		//public ExtentReport extent;
	
		public Homepage(WebDriver driver) {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			 //extent=new ExtentReport();
		}
	

	public void closePopUp() {
		helper.explicitWaitOfvisibilityOfElementLocated(HomeUi.popUp,50);
		helper.click(HomeUi.popUp);
		log.info("closed successfully");
		
	}

	public void clickOnSearch() {
		helper.explicitWaitOfvisibilityOfElementLocated(HomeUi.search,50);
		helper.clickOnSearch(HomeUi.search);
		log.debug("clicked successfully");
		
		
	}
	public void sendText(String string) {
		helper.explicitWaitOfvisibilityOfElementLocated(HomeUi.sendText,50);
		helper.sentText(HomeUi.sendText,string);
		log.info("sended text successfully");
	}


	public void textContain() {
		helper.explicitWaitOfvisibilityOfElementLocated(HomeUi.getText,50);
		helper.textContains(HomeUi.getText);
		log.debug("get text");
		
	}


	public void clickOnSearch2() {
		helper.explicitWaitOfvisibilityOfElementLocated(HomeUi.search2,50);
		helper.clickOnSearch(HomeUi.search2);
		log.debug("clicked successfully");
		
	}

}
