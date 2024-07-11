package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import AswagLab.TestClass;

public class Extends_Report extends TestClass{
	static ExtentReports report;
	
	public static ExtentReports getReportInstance() {
		if(report==null)
		{
			String ReportName=new SimpleDateFormat("dd-MM-YYYY ss-mm-HH").format(new Date());
			ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\user\\Pictures\\SwagLabTestNG\\ExtendReport"+ReportName+".html");
			report=new ExtentReports();
			report.attachReporter(htmlReporter);
     		report.setSystemInfo("OS", "Windows");
     		report.setSystemInfo("Environmnet", "SIT");
     		report.setSystemInfo("Build", "102.02.02.123");
     		report.setSystemInfo("Browser", "chrome");
     		htmlReporter.config().setDocumentTitle("UI Testing Documents");
	        htmlReporter.config().setReportName("UI Test Report");
		}
		return report;
	}
	
}
