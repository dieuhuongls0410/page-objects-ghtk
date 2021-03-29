package com.GHTK.CreatePackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.CreatePackagesFactory;
import pageFactory.ListPackagesFactory;
import pageFactory.LoginPageFactory;


@Test
public class Create_Package_04_PageFactory {
	WebDriver driver;
	String loginPageUrl, ListPackageUrl, createPackageUrl;
	LoginPageFactory loginPage;
	ListPackagesFactory listPackage;
	CreatePackagesFactory createPackage;
	String username, password, customertel, customername, customerfirstadd, productname, productweight, pickmoney;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		System.out.print(driver);
		loginPage = new LoginPageFactory(driver);
		listPackage = new ListPackagesFactory();
		createPackage = new CreatePackagesFactory();
		driver.get("https://khachhang.giaohangtietkiem.vn/khach-hang/dang_nhap");
//		loginPageUrl = loginPage.getCurrentUrl(driver);
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
		LoginPageFactory.inputToEmailTextbox(username);
		LoginPageFactory.inputToPaswordTextbox(password);
		LoginPageFactory.clickToLoginButton();

	}

	public void TC_02_Create_Package_Normail_01() {


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
