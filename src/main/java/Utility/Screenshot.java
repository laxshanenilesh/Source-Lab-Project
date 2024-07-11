package Utility;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import AswagLab.TestClass;

public class Screenshot extends TestClass {
	
	public static String Getdate()
	{
		return ("dd-MM-YYYY ss-mm-HH").formatted(new Date());		
	}
	
		
	public static void screenshot(String NameOfMetod) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\user\\Pictures\\SwagLabTestNG\\ScreenShot\\"+NameOfMetod+"--"+Getdate()+".jpeg");
		FileHandler.copy(source, dest);
		
		
	}

}
