package B_PagesConnection;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AswagLab.TestClass;
import Utility.ReadProperties;

public class FacebookLogin extends TestClass {
	// Repository code
	
	@FindBy(xpath="//span[contains(text(), 'Email address or phone number')]")private WebElement Username;
	@FindBy(xpath="//label[@aria-label='Password']")private WebElement Password;
	@FindBy(xpath="//span[text()='Log in' and contains(@class, 'x1j85h84')]")private WebElement Login;
	
	
	// Calling Method
	public FacebookLogin() {
		PageFactory.initElements(driver, this);
	}
	public String FacebookLogins() throws IOException
	{
		Username.sendKeys(ReadProperties.ReadFileSwagLab("FacebookUserName"));
		Password.sendKeys(ReadProperties.ReadFileSwagLab("FacebookPassword"));
		Login.click();
		return driver.getCurrentUrl();
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//		 wait.until(ExpectedConditions.visibilityOf(Username));
//	        Username.sendKeys(ReadProperties.ReadFileSwagLab("FacebookUsername"));
//
//	        // Wait for the Password field and enter the password
//	        wait.until(ExpectedConditions.visibilityOf(Password));
//	        Password.sendKeys(ReadProperties.ReadFileSwagLab("FacebookPassword"));
//
//	        // Wait for the Login button and click it
//	        wait.until(ExpectedConditions.elementToBeClickable(Login));
//	        Login.click();
//		Username.sendKeys(ReadProperties.ReadFileSwagLab("FacebookUserName"));
//		Password.sendKeys(ReadProperties.ReadFileSwagLab("FacebookPassword"));
//		Login.click();
	//	return driver.getCurrentUrl();
		
	}	
}
