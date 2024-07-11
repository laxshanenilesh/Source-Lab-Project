package B_PagesConnection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AswagLab.TestClass;

public class Cart_Pages extends TestClass {
   
    @FindBy(xpath="//span[text()='Your Cart']") private WebElement PageTitle;
    @FindBy(xpath="//button[@id='checkout']") private WebElement CheckOutBtn;

   
    public Cart_Pages() {
	 PageFactory.initElements(driver, this);
	}
     
	public String verifyPageURL() { 		
       return driver.getCurrentUrl();
    }
    
    public String verifyPageTitle(){
	 return PageTitle.getText();    	
    } 
    public String ClickOnCheckOutBtn()
    {
    	CheckOutBtn.click();
		return driver.getCurrentUrl();
    }
}
