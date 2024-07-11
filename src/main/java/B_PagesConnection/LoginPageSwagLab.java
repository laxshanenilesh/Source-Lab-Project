package B_PagesConnection;
import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import AswagLab.TestClass;
import Utility.Extends_Report;
import Utility.ReadProperties;

public class LoginPageSwagLab extends TestClass {
	
	 @FindBy(xpath="//input[@id='user-name']")public WebElement usertxtbox;
	    @FindBy(xpath="//input[@id='password']")public WebElement userPassword; 
	     @FindBy(xpath="//input[@type='submit']")public WebElement login;
	     
	     
	
	     public LoginPageSwagLab()
	     {
	    	 PageFactory.initElements(driver,this);
	     }
	     
	                                                                                      // Extend Report Code!
	     public String LoginToApplication() throws IOException {                 //  public ExtentReports report=Extends_Report.getReportInstance();
	 	                                                                         //   public ExtentTest logger;
                                                                                 //   logger=report.createTest("Login to Sauce Lab Application");
	       logger=report.createTest("Login to Sauce Lab Application");           //   logger.log(Status.INFO,"User Name Is Enterde"); 
	       usertxtbox.sendKeys(ReadProperties.ReadFileSwagLab("Username"));	     //   logger.log(Status.INFO, "Password Is Enterd");  	 
	       logger.log(Status.INFO,"User Name Is Enterde");                       //   logger.log(Status.INFO, "Login Is btn Click");
	       userPassword.sendKeys(ReadProperties.ReadFileSwagLab("Password"));    //   logger.log(Status.PASS, "Login Is Sucssefully");
	       logger.log(Status.INFO, "Password Is Enterd");                        //    report.flush();
	       login.click();
	       logger.log(Status.INFO, "Login Is btn Click");
	       logger.log(Status.PASS, "Login Is Sucssefully");
	    	 return driver.getCurrentUrl();	    	 
	     }
	
	    	    
	
	public String verifyurl() { 
       return driver.getCurrentUrl();
    }
    
    public String verifyTitle(){
	 return driver.getTitle();    	
    }
}
