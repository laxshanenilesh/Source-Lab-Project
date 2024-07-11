package AswagLab;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.Extends_Report;
import Utility.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	public ExtentReports report=Extends_Report.getReportInstance();
	public ExtentTest logger;
    public static WebDriver driver;
		
	public void initializeDriver() throws IOException    
	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//	}
		
		String browser=ReadProperties.ReadFileSwagLab("Browser");
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver();
			driver=new ChromeDriver();
		}
//		else if(browser.equals("edge")){
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
//		}
//		else if(browser.equals("firfox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();	
//		}
		driver.manage().window().maximize();
		driver.get(ReadProperties.ReadFileSwagLab("URL"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
