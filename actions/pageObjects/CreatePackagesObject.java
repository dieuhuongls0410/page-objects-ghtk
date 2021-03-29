package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUIs.CreatePackagesUI;

public class CreatePackagesObject extends AbstractPage {
	WebDriver driver;
	public CreatePackagesObject(WebDriver mappingDriver) {
		 driver = mappingDriver;	
		 System.out.print(driver);
	}
	
	public void inputToCustomerTelTextbox(String customertel ) {
		waitForElementVisible(driver, CreatePackagesUI.CUSTOMER_TEL_TEXTBOX);
		sendkeyToElement(driver, CreatePackagesUI.CUSTOMER_TEL_TEXTBOX, customertel);
}
	public void inputToCustomerNameTextbox(String customername ) {
		waitForElementVisible(driver, CreatePackagesUI.CUSTOMER_FULLNAME_TEXTBOX);
		sendkeyToElement(driver, CreatePackagesUI.CUSTOMER_FULLNAME_TEXTBOX, customername);
}
	public void inputToCustomerFirstAddTextbox(String customerfirstadd ) {
		waitForElementVisible(driver, CreatePackagesUI.CUSTOMER_FIRST_ADDRESS_TEXTBOX);
		sendkeyToElement(driver, CreatePackagesUI.CUSTOMER_FIRST_ADDRESS_TEXTBOX, customerfirstadd);
}
	
//	PICK_MONEY_TEXTBOX
	public void inputToPickmoneyTextbox(String pickmoney ) {
		waitForElementVisible(driver, CreatePackagesUI.PICK_MONEY_TEXTBOX);
		sendkeyToElement(driver, CreatePackagesUI.PICK_MONEY_TEXTBOX, pickmoney);
}

	public String clickFirstItemInDropDown() {
//		waitForElementPresence(driver, CreatePackagesUI.LIST_ADDRESS_ITEM_SUGGESTION);
		try {
	Thread.sleep(5000);
		}catch(Exception e) {}
		return getSelectFirstItemInDropdown(driver, CreatePackagesUI.LIST_ADDRESS_SUGGESTION);
	}
	public void clickToCustomerFirstAdd() {
		clickToElement(driver, CreatePackagesUI.SELECT_FIRST_ADDRESS);
		
	}
	public ListPackagesObject clickSubmitpackage() {
		clickToElement(driver, CreatePackagesUI.SUBMIT_PACKAGE);
		return PageGeneratorManager.getListPackages(driver);
	}
	public void clickToCustomerProvince() {
		clickToElement(driver, CreatePackagesUI.SELECT_CUSTOMER_PROVINCE);
		
	}
	public void clickToCustomerDistrict() {
		clickToElement(driver, CreatePackagesUI.SELECT_CUSTOMER_DICSTRICT);
		
	}
	public void clickToCustomerWardStreet() {
		clickToElement(driver, CreatePackagesUI.SELECT_CUSTOMER_WARD);
		
	}
	
	
	public void clickToCustomerSpecific() {
		clickToElement(driver, CreatePackagesUI.SELECT_CUSTOMER_SPECIFIC);
		
	}
	public void clickToFlyTransport() {
		clickToElement(driver, CreatePackagesUI.FLY_TRANSPORT_CHECKBOX);
		
	}
	public void clickToNotFreeship() {
		clickToElement(driver, CreatePackagesUI.NOT_FREESHIP);
		
	}public void clickToRoadTransport() {
		clickToElement(driver, CreatePackagesUI.ROAD_TRANSPORT_CHECKBOX);
		
	}public void clickToIsFreeship() {
		clickToElement(driver, CreatePackagesUI.IS_FREESHIP);
		
	}
	public void inputToProductName(String productname ) {
//		waitForElementVisible(driver, CreatePackagesUI.PRODUCT_NAME_TEXTBOX);
		sendkeyToElement(driver, CreatePackagesUI.PRODUCT_NAME_TEXTBOX, productname);
}
	public void inputToProductWeight(String productweight ) {
		waitForElementVisible(driver, CreatePackagesUI.PRODUCT_WEIGHT_TEXTBOX);
		sendkeyToElement(driver, CreatePackagesUI.PRODUCT_WEIGHT_TEXTBOX, productweight);
}
	
}