package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginStep {
	
	
	public WebDriver driver;
	public LoginPage loginPage;
	
	@Given("User launches chrome browser")
	public void user_launches_chrome_browser() {
	   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src/test/resources/Driver/chromedriver.exe");

		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		
		}

	@When("User opens URL {string}")
	public void user_opens_url(String url_QA) {
	    
		driver.get(url_QA);
		driver.manage().window().maximize();
		
	}

	@When("User enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String email, String pwd) {
	    
		
		loginPage.enterUserName(email);
		loginPage.enterPassword(pwd);
		
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    
		loginPage.clickLoginButton();
		
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
	    
		
		
		
	}

	@Then("User clicks logout button")
	public void user_clicks_logout_button() {
	    
		
	}

	@Then("Close browser")
	public void close_browser() {
	    
		
	}


}
