package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class stepDefination {
	
	public static WebDriver driver;
	public static LoginPage loginPage;
	
	
	
	@Given("Open the browser")
	public void open_the_browser() {
		
		driver= new ChromeDriver();
		loginPage = new LoginPage(driver);    	  
	}

	@When("Enter the URL {string}")
	public void enter_the_url(String url) throws Exception {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    
	}
	@When("Enter the username and password")
	public void enter_the_username_and_password() throws Exception {
		loginPage.EnterUserCredetiantials();
	   
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() throws Exception {
		loginPage.clickOnLoginButton();
	}

	@Then("Verify that login is successful")
	public void verify_that_login_is_successful() throws Exception {
		loginPage.clickOnDropDown();
	   
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	}


}
