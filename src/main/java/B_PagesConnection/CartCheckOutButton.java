package B_PagesConnection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AswagLab.TestClass;

public class CartCheckOutButton  extends TestClass{
	
	@FindBy(xpath="//input[@name='firstName']") private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastName']") private WebElement LastName;
	@FindBy(xpath="//input[@name='postalCode']") private WebElement PostalCode;
	@FindBy(xpath="//input[@name='continue']") private WebElement ClickContineuButton;
	
	public CartCheckOutButton() {
		PageFactory.initElements(driver, this);
	}
	public String CheckOutInfo()
	{
		FirstName.sendKeys("Nilesh");
		LastName.sendKeys("Lakshane");
		PostalCode.sendKeys("442203");
		ClickContineuButton.click();
		return driver.getCurrentUrl();
	}
	
	
	

}
