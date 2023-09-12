package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testRunner.testRunnerTest;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Uname;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Pswrd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement LoginButton;
	

	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement UserDropDownClick;
	
	@FindBy(xpath="//a[normalize-space()='Change Password']")
	WebElement ChnagePassword;
	
	public void EnterUserCredetiantials() throws Exception {
		Uname.sendKeys("Admin");
		Thread.sleep(2000);
		Pswrd.sendKeys("admin123");
	}
	
	public void clickOnLoginButton() throws Exception {
		LoginButton.click();
		Thread.sleep(2000);
	}
	
	public void clickOnDropDown() throws Exception {
		UserDropDownClick.click();
		Thread.sleep(2000);
		ChnagePassword.click();
		
		
	}
	
	


}
