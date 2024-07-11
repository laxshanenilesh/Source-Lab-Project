package TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import AswagLab.TestClass;
import B_PagesConnection.LoginPageSwagLab;
import Utility.ReadExcelData;
import Utility.ReadProperties;
import Utility.Screenshot;

public class LoginPages_Test extends TestClass{
        LoginPageSwagLab login;
        
        
      @BeforeMethod
      public void setup() throws IOException
      {
    	super.initializeDriver();
    	 login=new LoginPageSwagLab(); 	
      }
	 
	  @Test
	  public void LoginToApplication() throws IOException
	  {
		  String expURL= "https://www.saucedemo.com/inventory.html";        //ReadExcelData.ReadExcelSheetData(0, 0);     //"https://www.saucedemo.com/inventory.html"(0,0);
		  String acturl=login.LoginToApplication();
		  Assert.assertEquals(expURL, acturl);
		  Reporter.log("Application Is Login using Actual URL ="+ acturl);
	  }	  
	    
	   @Test
	     public void SwagLabloginURL() throws IOException
	     {
		   String exp="https://www.saucedemo.com/";      //ReadExcelData.ReadExcelSheetData(0, 1);        //"https://www.saucedemo.com/"(0,1);
		   String act=login.verifyurl();
		   Assert.assertEquals(exp, act);
		   Reporter.log("Actual URL Is ="+ act);
   }
	   
//	   @Test  this method is use to check those method is wrong to takes a screenshot of thos methods using this way
//  	 public void SwagLabTitlePage() throws IOException 
//    {	    		 
//String exp="Swag Labss";  //"Swag Labsss" This line is use to check screnshot tiltle is correct or not if not then take screenshot of this method SwagLabTitlePage())
//  	 //...........    //ReadExcelData.ReadExcelSheetData(0, 2);  //"Swag Labs"(0,2);
//  	 String Act=login.verifyTitle();
//       Assert.assertEquals(exp, Act);
//       Reporter.log("SwagLabTitlePage name is="+ Act);
//       
//  	 }

	   
     @Test 
    	 public void SwagLabTitlePage() throws IOException 
      {	    		 
       String exp="Swag Labs";  
    	 String Act=login.verifyTitle();
         Assert.assertEquals(exp, Act);
         Reporter.log("SwagLabTitlePage name is="+ Act);
         
    	 }

     @AfterMethod 
     public void CloseConnection(ITestResult result) throws IOException 
     {
    	 if(result.FAILURE==result.getStatus())
    	 {
    		 Screenshot.screenshot(result.getName());
    	 }
         report.flush();
        driver.close();
         }
     }
