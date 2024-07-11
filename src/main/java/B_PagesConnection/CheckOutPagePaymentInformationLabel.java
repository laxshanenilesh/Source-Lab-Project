package B_PagesConnection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AswagLab.TestClass;

public class CheckOutPagePaymentInformationLabel extends TestClass{
   
	@FindBy(xpath="//div[text()='Payment Information:']") private WebElement PaymentInfoLabel;
	@FindBy(xpath="//div[text()='SauceCard #31337']") private WebElement SauceCardLabel;
	
	public CheckOutPagePaymentInformationLabel() {
	 PageFactory.initElements(driver, this);	
	}
	
	
	public String verifyPaymentInformationLabel()
	{
	 return PaymentInfoLabel.getText();		
	}
	public String SauceCardLabel()
	{
		return SauceCardLabel.getText();
	}
	
	
}
