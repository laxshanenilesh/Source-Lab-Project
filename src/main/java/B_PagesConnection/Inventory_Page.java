package B_PagesConnection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AswagLab.TestClass;

public class Inventory_Page extends TestClass{
	   
	// Object Repository
	
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']") private WebElement  ProductBagPack;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bike-light']") private WebElement ProductBikeLight;
	 @FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement TshirtAddCart;
     @FindBy(xpath="//button[@name='add-to-cart-sauce-labs-fleece-jacket']") private WebElement JacketAddCart;
     @FindBy(xpath="//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement WebRedTshirtAddCart;
     @FindBy(xpath="//button[@name='remove-sauce-labs-backpack']") private WebElement removeBackPackProduct;
     @FindBy(xpath="//button[@name='remove-sauce-labs-bike-light']") private WebElement RemoveBikeLightProduct;
     @FindBy(xpath="//span[@class='title']") private WebElement PageTitle;
     @FindBy(xpath="//a[text()='Twitter']") private WebElement TwitterLogo;
     @FindBy(xpath="//select[@class='product_sort_container']") private WebElement DropDown;
     @FindBy(xpath=" //span[@class='shopping_cart_badge']") private WebElement CartCount;
     @FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement CartIcon;  
     @FindBy(xpath="//a[text()='Facebook']") private WebElement FacebookLogo;
     @FindBy(xpath="//a[text()='LinkedIn']")private WebElement LinkdinLogo;
    
    
 	
     // Calling
     
	public Inventory_Page() {
		PageFactory.initElements(driver, this);
	}
	
	//  Create Method
	public String VerifyHomePageTitle() throws InterruptedException
	{
	    Thread.sleep(2000);
		return PageTitle.getText();		
	}
	
	public boolean VerifyTwitterLogo() throws InterruptedException
	{
	    Thread.sleep(5000);
		return TwitterLogo.isDisplayed();		
	}
	public boolean FaceBookLogo() throws InterruptedException
	{     
		
		 FacebookLogo.click();
		return FacebookLogo.isDisplayed();		
	}
	
	public boolean LinkdinLogo() throws InterruptedException
	{    
		Thread.sleep(5000);
		return LinkdinLogo.isDisplayed();		
	}

	public String AddCart6Product() throws InterruptedException
	{
	Select dropdown=new Select(DropDown);
	dropdown.selectByVisibleText("Price (low to high)");
	ProductBagPack.click();
	ProductBikeLight.click();
	TshirtAddCart.click();
    JacketAddCart.click();
    WebRedTshirtAddCart.click();
    Thread.sleep(5000);    
	return CartCount.getText();
	}
	
	public String RemoveAddCartProduct() throws InterruptedException
	{
		AddCart6Product();  // call this method when u want to remove some attom from Cart.
		removeBackPackProduct.click();
		RemoveBikeLightProduct.click();
		return CartCount.getText();
		
	}
	public void ClickOnCart()
	{
	   CartCount.click();
	}

	
//	public String SelectFilterPriceHighToLow() throws InterruptedException	
//	{
//		Select Price=new Select(DropDown);
//		Price.selectByVisibleText("Price (low to high)");
//		ProductBagPack.click();
//		ProductBikeLight.click();
//		TshirtAddCart.click();
//	    JacketAddCart.click();
//	    WebRedTshirtAddCart.click();
//	    Thread.sleep(5000);   
//		return CartCount.getText();		
//	}
	  

		
}
