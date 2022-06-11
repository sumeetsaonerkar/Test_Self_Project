package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver ldriver; 
	WebDriverWait wait;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id = "userName")
	WebElement userEmail;
	
	@FindBy(id = "password")
	WebElement userPassword;
	
	@FindBy(xpath = "//*[text()='Log in']")
	WebElement login;
	
	@FindBy(xpath = "//button[@id='header-logout-HLGU1']")
	WebElement logoutBtn;
	
	@FindBy(xpath = "//*[text()='Confirm']")
	WebElement confirmText;
	
	public void enterUserName(String username) {
		
		userEmail.clear();
		userEmail.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		userPassword.clear();
		userPassword.sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		
		login.click();
		
	}
	
	
	
	public void waitCommand() {
		
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(200));
		
	}

}
