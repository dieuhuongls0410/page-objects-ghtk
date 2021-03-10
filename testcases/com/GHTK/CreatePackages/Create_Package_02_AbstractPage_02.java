package com.GHTK.CreatePackages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import commons.AbstractPage;

public class Create_Package_02_AbstractPage_02 extends AbstractPage {
	WebDriver driver;

	By ShopEmail = By.id("ShopEmail");
	By ShopPassword = By.id("ShopPassword");
	By Login = By.xpath("//span[contains(text(),'Đăng Nhập')]");
	By CustomerTel = By.id("Package0CustomerTelMask");
	By CustomerFullname = By.id("Package0CustomerFullname");
	By ProductName = By.id("0");
	By ProductWeigh = By.id("Package0Order0Weight");
	By Pickmoney = By.xpath("//*[@id=\"Package0PickMoney\"]");
	By CustomerFirstAdd = By.xpath("//input[@class='select2-search__field']");
	By SelectCustomerFirstAdd = By.xpath("//span[@class='select2-selection select2-selection--single']");
	By ClientId = By.id("Package0ClientId");
	By SuccessCreatePackage = By.xpath("//*[@class='alert alert alert-success']");
	By CreateNewPackage = By.id("check-overload");
	By FlyTransport = By.xpath("//*[@value='fly']");
	By RoadTransport = By.xpath("//*[@value='road']");
	By IsFreeship = By.id("Package0IsFreeship1");
	By NotFreeship = By.id("Package0IsFreeship0");
	By PickOptionPost = By.xpath("//*[@value='post']");
	By ListPO = By.xpath("//*[@class='dd-select']");

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
// Selenium API
//		driver.get("https://khachhang.giaohangtietkiem.vn/khach-hang/dang_nhap");

//AbstractPage
		openUrl(driver, "https://khachhang.giaohangtietkiem.vn/khach-hang/dang_nhap");
		System.out.println("Pre-Condition - Step 1 Get Login page URL");
//Mo trang dang nhap GHTK
//		String loginPageUrl = driver.getCurrentUrl();
//		Assert.assertEquals(loginPageUrl, "https://khachhang.giaohangtietkiem.vn/khach-hang/dang_nhap");
//		String loginPageTitle = driver.getTitle();
//		Assert.assertEquals(loginPageTitle, "GHTK - Dịch vụ giao hàng trong ngày chuyên nghiệp");
// mo trang dang nhap abstractPage

//Dang nhap GHTK
//		driver.findElement(ShopEmail).sendKeys("huongntd111@ghtk.vn");
//		driver.findElement(ShopPassword).sendKeys("123456");
//		driver.findElement(Login).click();
// login abstractPage
		sendkeyToElement(driver, "//input[@id='ShopEmail']", "huongntd111@ghtk.vn");
		sendkeyToElement(driver, "//input[@id='ShopPassword']", "123456");
		clickToElement(driver, "//span[contains(text(),'Đăng Nhập')]");
	}

	@Test
	public void TC_01_Create_Packages_Road_Transport() throws Exception {
		driver.findElement(CustomerTel).sendKeys("0388722250");
		driver.findElement(CustomerFullname).sendKeys("Nguyễn Thị Diệu Hương");
		driver.findElement(ProductName).sendKeys("Quần áo");
		driver.findElement(ProductWeigh).sendKeys("0.5");
		driver.findElement(Pickmoney).sendKeys("4000000");
		driver.findElement(SelectCustomerFirstAdd).click();
		Thread.sleep(2000);
		driver.findElement(CustomerFirstAdd).sendKeys("số 22 đường Đội Cấn, Ba Đình , HN");
		Thread.sleep(5000);
		// Lay ra list dia chi cap 4
		List<WebElement> dropDownMenu = driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
		// cach chon dropdown voi element nhat dinh
		dropDownMenu.get(0).click();
		Thread.sleep(2000);
		// driver.findElement(ClientId).sendKeys("TCX1");
		driver.findElement(By.id("submit-packages")).click();
		Thread.sleep(5000);
		driver.findElement(SuccessCreatePackage).isDisplayed();
		System.out.println("TC_01_Create_Packages_Road_Transport SUCCESSFUL");
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
