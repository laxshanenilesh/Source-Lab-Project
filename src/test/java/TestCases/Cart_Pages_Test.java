package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AswagLab.TestClass;
import B_PagesConnection.Cart_Pages;
import B_PagesConnection.FacebookLogin;
import B_PagesConnection.Inventory_Page;
import B_PagesConnection.LoginPageSwagLab;
import Utility.Screenshot;

public class Cart_Pages_Test extends TestClass {
    Cart_Pages cartpage;
	LoginPageSwagLab login;
	Inventory_Page invent;
	FacebookLogin fb;
	
	@BeforeMethod
	public void SetUp() throws IOException, InterruptedException
	{
		initializeDriver();
		invent=new Inventory_Page();
	    login=new LoginPageSwagLab();
	    cartpage=new Cart_Pages();
	    fb=new FacebookLogin();
	    login.LoginToApplication();
	    invent.AddCart6Product();
	    invent.ClickOnCart();
	}
	  
	 @Test
	  public void VerifyURL()
	  {
		 String expURL="https://www.saucedemo.com/cart.html";
		 String actURL=cartpage.verifyPageURL();
	     Assert.assertEquals(expURL, actURL);
		 Reporter.log("Cart URL:"+actURL);
	  }
	 @Test
	 public void VerifyPageTitle()
	 {
		 String expPageTitle="Your Cart";
		 String actPageTitle=cartpage.verifyPageTitle();
		 Assert.assertEquals(expPageTitle, actPageTitle);
		 Reporter.log("Your Cart TitlePage:"+actPageTitle);
	 }
	 @Test
	 public void ClickOnCheckOutBtn()
	 {
		 String ActCheckOutBtnURL="https://www.saucedemo.com/checkout-step-one.html";
		 String ExpCheckOutBtnURL=cartpage.ClickOnCheckOutBtn();
		 Assert.assertEquals(ActCheckOutBtnURL, ExpCheckOutBtnURL);
		 Reporter.log("CheckOutBtn URL"+ExpCheckOutBtnURL);
	 }
	 @AfterMethod 
     public void CloseConnection(ITestResult result) throws IOException 
     {
    	 if(result.FAILURE==result.getStatus())
    	 {
    		 Screenshot.screenshot(result.getName());
    	 }
        driver.close();
         }
	  
}
