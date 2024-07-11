package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AswagLab.TestClass;
import B_PagesConnection.FacebookLogin;
import B_PagesConnection.Inventory_Page;
import B_PagesConnection.LoginPageSwagLab;
import Utility.ReadExcelData;

public class InventoryPage_TestCase extends TestClass {
	LoginPageSwagLab login;
	Inventory_Page invent;
	FacebookLogin fb;
	@BeforeMethod
	public void SetUp() throws IOException
	{
		initializeDriver();
		invent=new Inventory_Page();
	    login=new LoginPageSwagLab();
	    fb=new FacebookLogin();
	    login.LoginToApplication();
	}
	@Test
	public void HomePageTitle() throws InterruptedException
	{
		String exp="Products";
		String acttitle=invent.VerifyHomePageTitle();
		Assert.assertEquals(exp, acttitle);
		Reporter.log("HomePage Title"+acttitle);
	}
	@Test
	public void PageLogo() throws InterruptedException
	{
		boolean result = invent.VerifyTwitterLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Twitter Logo Present :"+result);
	}
	@Test
	public void Add6Product() throws InterruptedException, EncryptedDocumentException, IOException
	{   
		String expCount=ReadExcelData.ReadExcelSheetData(0, 3);        //"5"(0,3);
		String actCount = invent.AddCart6Product();
		Assert.assertEquals(expCount, actCount);
		Reporter.log("Actuall Product Count Added in Cart :"+actCount);
	}
	@Test
	public void CartRemoveProduct() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String exp=ReadExcelData.ReadExcelSheetData(0, 4);   //"3"(0,4);
		String remove = invent.RemoveAddCartProduct();
		Assert.assertEquals(exp, remove);
		Reporter.log("CartProduct Remove Product Name :"+remove);
	}
	
	@Test
	public void FaceBookLogo() throws InterruptedException
	{    
		 boolean display = invent.FaceBookLogo();
		 Assert.assertEquals(display, true);
		 Reporter.log("FaceBookLogo Is Visible :"+display);		 
	}
	@Test
	public void LinkdinLogo() throws InterruptedException
	{
		boolean LinkdinLogo = invent.LinkdinLogo();
		Assert.assertEquals(LinkdinLogo, true);
		Reporter.log("LinkdinLogo Is Visible :"+LinkdinLogo);
	}
	
	
//	@Test
//	public void HighToLowPrice() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		String exp=ReadExcelData.ReadExcelSheetData(0, 5);       //"5"(0,4);
//		String Price = invent.SelectFilterPriceHighToLow();
//		Assert.assertEquals(exp, Price);
//		Reporter.log(Price);		  
//	}
	
//	@Test
//	public void FacebookLogin() throws IOException, InterruptedException
//	{
//	   invent.FaceBookLogo();
//		fb.FacebookLogins();      
//	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
}
