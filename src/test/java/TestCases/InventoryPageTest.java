package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class InventoryPageTest extends TestBase {
	InventoryPage invent;
	 LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception 
	{
		initialization();
		 invent = new InventoryPage();
		  login = new LoginPage();
	}
	
	@Test  (enabled = false)
	public void verifySmallLogoTest() throws Exception
	{
		login.loginToApp();
	boolean result = invent.verifySmallLogo();
	Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void verifybigLogoTest() throws Exception
	{
		login.loginToApp();
		boolean result = invent.verifybigLogo();
		Assert.assertEquals(result,true);
	}
	@Test
	public void add6ProductTest() throws Exception 
	{
		
		login.loginToApp();
	 String result = invent.add6Product();
	// Assert.assertEquals(result,"6");
	 Assert.assertEquals(result, ReadData.ReadExcelFile(1,0));
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}
