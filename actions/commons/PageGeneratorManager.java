package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.CreatePackagesObject;
import pageObjects.ListPackagesObject;
import pageObjects.LoginPageObject;

public class PageGeneratorManager {
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	public static CreatePackagesObject getCreatePackages(WebDriver driver) {
		return new CreatePackagesObject(driver);
	}

	public static ListPackagesObject getListPackages(WebDriver driver) {
		return new ListPackagesObject(driver);
	}
}
