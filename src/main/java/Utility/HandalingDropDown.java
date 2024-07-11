package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AswagLab.TestClass;

public class HandalingDropDown extends TestClass {
	
	public void HandleDropDown(WebElement ele, String value)
	{
		 Select DropDownList= new Select(ele);
		 DropDownList.selectByVisibleText("value");
		  
	}
 
}
