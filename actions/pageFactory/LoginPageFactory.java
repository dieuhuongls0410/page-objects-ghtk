package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
private WebDriver driver;
	@FindBy(how = How.XPATH, using="//input[@id='ShopEmail']")
	private static WebElement emailTextbox;
	
	@FindBy(how = How.XPATH, using="//input[@id='ShopPassword']")
	private static WebElement passwordTextbox;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Đăng Nhập')]")
	private static WebElement loginButton;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageUrl()  {
		return driver.getCurrentUrl();
	}

	
	public static void inputToEmailTextbox(String username ) {
		emailTextbox.sendKeys(username);
	}


	public static void inputToPaswordTextbox(String password) {
		passwordTextbox.sendKeys(password);
	}

	public static void clickToLoginButton() {
		loginButton.click();
		
	}


	public void ClickToEmailTextbox() {
		emailTextbox.click();
		
	}


	public void ClickToPasswordTextbox() {
		passwordTextbox.click();
		
		
	}




	
}
