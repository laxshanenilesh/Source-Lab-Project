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
import B_PagesConnection.CheckOutPagePaymentInformationLabel;
import B_PagesConnection.FacebookLogin;
import B_PagesConnection.Inventory_Page;
import B_PagesConnection.LoginPageSwagLab;
import Utility.Screenshot;

public class CheckOutPagePaymentInformationLabel_Test extends TestClass {

	    Cart_Pages cartpage;
		LoginPageSwagLab login;
		Inventory_Page invent;
		CartCheckOutButton CheckOutBtn;	
		CheckOutPagePaymentInformationLabel label;
		FacebookLogin fb;
  
		@BeforeMethod
		public void PaymentInformationLabelSetUp() throws IOException, InterruptedException
		{
			initializeDriver();
			invent=new Inventory_Page();
		    login=new LoginPageSwagLab();
		    cartpage=new Cart_Pages();
		    CheckOutBtn=new CartCheckOutButton();
		    label=new CheckOutPagePaymentInformationLabel(); 
		    fb=new FacebookLogin();
		    login.LoginToApplication();
		    invent.AddCart6Product();
		    invent.ClickOnCart();
		    cartpage.ClickOnCheckOutBtn();
		    CheckOutBtn.CheckOutInfo();
		}

          @Test 
           public void PaymentInformationLabel()
        {
        	  String expPaymentInformationLabel="Payment Information:";
	          String actPaymentInformationLabel=label.verifyPaymentInformationLabel();
			  Assert.assertEquals(expPaymentInformationLabel, actPaymentInformationLabel);
			  Reporter.log(actPaymentInformationLabel);			
      }
          
          @Test
          public void SauceCardLabel()
          {
        	  String expSauceCardLabel="SauceCard #31337";
        	  
        	  String actSauceCardLabel=label.SauceCardLabel();
        	  Assert.assertEquals(expSauceCardLabel, actSauceCardLabel);
        	  Reporter.log(actSauceCardLabel);
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
   