package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AswagLab.TestClass;
import B_PagesConnection.CartCheckOutButton;
import B_PagesConnection.Cart_Pages;
import B_PagesConnection.FacebookLogin;
import B_PagesConnection.Inventory_Page;
import B_PagesConnection.LoginPageSwagLab;
import Utility.Screenshot;

public class CartCheckOutButton_Test extends TestClass {
  
    Cart_Pages cartpage;
	LoginPageSwagLab login;
	Inventory_Page invent;
	CartCheckOutButton CheckOutBtn;	
	FacebookLogin fb;
	
	@BeforeMethod
	public void CartCheckOutButtonSetUp() throws IOException, InterruptedException
	{
		initializeDriver();
		invent=new Inventory_Page();
	    login=new LoginPageSwagLab();
	    cartpage=new Cart_Pages();
	    CheckOutBtn=new CartCheckOutButton();
	    fb=new FacebookLogin();
	    login.LoginToApplication();
	    invent.AddCart6Product();
	    invent.ClickOnCart();
	    cartpage.ClickOnCheckOutBtn();
	}
	@Test
	public void CheckOutButton()
	{
		String expCheckOut2URL="https://www.saucedemo.com/checkout-step-two.html";
        String actCheckOut2UR=CheckOutBtn.CheckOutInfo();
        Assert.assertEquals(expCheckOut2URL, actCheckOut2UR);
        Reporter.log("CheckOut2 URL:"+actCheckOut2UR);		
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
