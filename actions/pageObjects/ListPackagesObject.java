package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ListPackagesUI;

public class ListPackagesObject extends AbstractPage {
	WebDriver driver;
	public ListPackagesObject(WebDriver mappingDriver) {
		 driver = mappingDriver;	
		 System.out.print(driver);
	}
	
	public boolean isMessageDisplaySucceed() {
		String actualText =getTextElement(driver, ListPackagesUI.SUCCESS_MESSAGE);
		
		if(actualText.length() > 0) {
			return true;
		}
		return false;
		
	}

}
