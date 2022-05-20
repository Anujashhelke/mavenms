package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uistore.Home2Ui;
import utility.BaseClass;

public class WebDriverHelper extends BaseClass{
	

public void click(By popUp) {
	
		
		driver.findElement(popUp).click();
		
		
		
	}

	public void explicitWaitOfvisibilityOfElementLocated(By search, int i) {
	WebDriverWait wait=new WebDriverWait(driver,i);
	wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		
	}

	public void sentText(By sendText, String string) {
		driver.findElement(sendText).sendKeys(string);
		
	}

	public void textContains(By getText) {
		String str=driver.findElement(getText).getText();
		if(str.contains("CAR")) {
			System.out.println("text is present");
		}
		else {
			System.out.println("text is not preasent");
		}
		
	}

	public void action(By hover) {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(hover)).build().perform();
		
		
	}

	public void containsText() {
		if(driver.getPageSource().contains("Corporate Mission")) {
			System.out.println("true");
		}
		else {
			 System.out.println("false");
		}
		
	}

	public void getText(By text) {
		if(driver.findElement(text).getText().contains("Garage Details")) {
			System.out.println("true");
		}
		else {
			 System.out.print("false");
		}
		
		
	}

	public void clickOnSearch(By search) {
		WebElement ele=driver.findElement(search);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
		
	}

}
