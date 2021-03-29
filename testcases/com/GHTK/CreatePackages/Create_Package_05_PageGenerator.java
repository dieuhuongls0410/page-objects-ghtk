package com.GHTK.CreatePackages;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commons.PageGeneratorManager;
import pageObjects.CreatePackagesObject;
import pageObjects.ListPackagesObject;
import pageObjects.LoginPageObject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test
public class Create_Package_05_PageGenerator {
	WebDriver driver;
	String loginPageUrl, ListPackageUrl, createPackageUrl;
	LoginPageObject loginPage;
	ListPackagesObject listPackage;
	CreatePackagesObject createPackage;
	String username, password, customertel, customername, customerfirstadd, productname, productweight, pickmoney;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		System.out.print(driver);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		driver.get("https://khachhang.giaohangtietkiem.vn/khach-hang/dang_nhap");
		loginPageUrl = loginPage.getCurrentUrl(driver);
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

//		load e to array[] = ....

		username = "huongntd111@ghtk.vn";
		password = "123456";
		customertel = "0388722250";
		customername = "Nguyễn Thị Diệu Hương";
		customerfirstadd = "Tòa nhà Vinapaco Building, Đội Cấn, Ba Đình, HN";
		productname = "Quần áo";
		productweight = "0.1";
		pickmoney = "400000";
	}

	public void TC_01_Login() {
		loginPage.inputToEmailTextbox(username);
		loginPage.inputToPaswordTextbox(password);
		createPackage = loginPage.clickToLoginButton();
		loginPage.clickToLoginButton();
		

	}

	public void TC_02_Create_Package_Normail_01() {
//		driver.get("https://khachhang.giaohangtietkiem.vn/khach-hang/don-hang/them-don-hang");
		createPackage.inputToCustomerTelTextbox(customertel);
		createPackage.inputToCustomerNameTextbox(customername);
		createPackage.clickToCustomerFirstAdd();
		createPackage.inputToCustomerFirstAddTextbox(customerfirstadd);
		createPackage.clickFirstItemInDropDown();
		createPackage.inputToProductName(productname);
		createPackage.inputToProductWeight(productweight);
		createPackage.inputToPickmoneyTextbox(pickmoney);
		createPackage.clickSubmitpackage();
		listPackage = createPackage.clickSubmitpackage();
		if (listPackage.isMessageDisplaySucceed()) {
			System.out.println("TC_02_Create_Package_Normail_01: successed");
		} else {
			System.out.println("TC_02_Create_Package_Normail_01: failed");
		}

	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
