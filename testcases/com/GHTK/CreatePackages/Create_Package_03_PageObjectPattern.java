package com.GHTK.CreatePackages;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test
public class Create_Package_03_PageObjectPattern {
	WebDriver driver;
	String loginPageUrl;
	LoginPageObject loginPage;
	String username, password;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		System.out.print(driver);
		loginPage = new LoginPageObject(driver);

		driver.get("https://khachhang.giaohangtietkiem.vn/khach-hang/dang_nhap");
//		loginPageUrl = loginPage.getCurrentUrl(driver);
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

//		
		username = "huongntd111@ghtk.vn";
		password = "123456";

	}

	public void TC_01_Login() {
		loginPage.inputToEmailTextbox(username);
		loginPage.inputToPaswordTextbox(password);
		loginPage.clickToLoginButton();

	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
