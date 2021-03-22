package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPage {
	WebDriver driver;
	
public LoginPageObject(WebDriver mappingDriver ) {
 driver = mappingDriver;	
 System.out.print(driver);
}

	public String getLoginPageUrl()  {
		return getCurrentUrl(driver);
	}

	
	public void inputToEmailTextbox(String username ) {
		waitForElementVisible(driver, LoginPageUI.USER_EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.USER_EMAIL_TEXTBOX, username);
	}


	public void inputToPaswordTextbox(String password) {
		sendkeyToElement(driver, LoginPageUI.USER_PASSWORD_TEXTBOX, password);
	}

	public void clickToLoginButton() {
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		
	}


	public void ClickToEmailTextbox() {
		waitForElementVisible(driver, LoginPageUI.USER_EMAIL_TEXTBOX);
		clickToElement(driver, LoginPageUI.USER_EMAIL_TEXTBOX);
		
	}


	public void ClickToPasswordTextbox() {
		waitForElementVisible(driver, LoginPageUI.USER_PASSWORD_TEXTBOX);
		clickToElement(driver, LoginPageUI.USER_PASSWORD_TEXTBOX);
		
		
	}

}
