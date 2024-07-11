package Utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import AswagLab.TestClass;

public class ReadProperties extends TestClass {
    
	  // Utility package which is use to common property for all classes
	
	public static String ReadFileSwagLab(String value) throws IOException
	{
	Properties pro=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\user\\Pictures\\SwagLabTestNG\\src\\main\\java\\Dconfig\\Swaglab.properties");
	pro.load(file);
	return pro.getProperty(value);
  
	}
}
