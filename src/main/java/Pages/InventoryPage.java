package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase{
	
	@FindBy(xpath="//div[@class=\"peek\"]")private WebElement smallLogo;
	@FindBy(xpath="//img[@alt=\"Swag Bot Footer\"]")private WebElement bigLogo;
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")private WebElement filter;
	@FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-backpack\"]")private WebElement sasuceLabBackpack;
	@FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-bike-light\"]")private WebElement bikeLight;
	@FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")private WebElement boltTshirt;
	@FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-fleece-jacket\"]")private WebElement fleeceJacket;
	@FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-onesie\"]")private WebElement onesieShirt;
	@FindBy(xpath="//button[@data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")private WebElement RedTshirt;
	@FindBy(xpath="//span[@class=\"shopping_cart_badge\"]")private WebElement productCounter;
 public InventoryPage()
 {
	 PageFactory.initElements(driver, this);
 }
 public boolean verifySmallLogo() 
 {
	 return smallLogo.isDisplayed();
 }
 public boolean verifybigLogo()
 {
	return bigLogo.isDisplayed();
 }
 public String add6Product() throws Exception
 {
	 Select s = new Select(filter);
	//Select s = new Select(ReadData.)
	// s.selectByVisibleText("Price (low to high)");
	// s.selectByVisibleText(ReadData.ReadExcelFile(2, 0));
	// UtilityMethod.selectClass(filter, "Price (low to high)");
	 UtilityMethod.selectClass(filter,ReadData.ReadExcelFile(2,0));
	 
	 sasuceLabBackpack.click();
	 bikeLight.click();
	 boltTshirt.click();
	 fleeceJacket.click();
	 onesieShirt.click();
	 RedTshirt.click();
	String count =  productCounter.getText();
	return count;
	  }
 
 public void remove2Product() {
	 
 }

}
