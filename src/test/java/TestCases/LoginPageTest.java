package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenShot;
import Utility.ReadData;

public class LoginPageTest  extends TestBase {
	//we need login page to execute all the methods that is why we declared it globally
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		 login = new LoginPage();
	}
	@Test  
	public void loginToAppTest() throws Exception
	{
		String label = login.loginToApp();
	//	Assert.assertEquals(label, "PRODUCTS");
		Assert.assertEquals(label, ReadData.ReadExcelFile(0,3));
	//	Assert.assertEquals(label, "PRODUCTS1");  // incorrect code to take screen shot
	//	Assert.assertEquals(label, "1PRODUCTS1");  // incorrect code to take screen shot of test with name
	}
	
	@Test (enabled = false)
	public void loginToApp2Test() throws Exception
	{
	//	Assert.assertEquals(login.loginToApp2(),"https://www.saucedemo.com/inventory.html");
		Assert.assertEquals(login.loginToApp2(), ReadData.ReadExcelFile(0,0));
	}
	
	
	
	@Test (enabled = false)
	public void verifyTitleTest() throws Exception 
	{
	     String title = login.verifyTitle();
	   //  Assert.assertEquals(title,"Swag Labs");
	     Assert.assertEquals(title, ReadData.ReadExcelFile(0, 1));
	}
	
	@Test (enabled = false)
	public void verifyUrlTest() throws Exception
	{
		
 String url	= 	login.verifyUrl();
// Assert.assertEquals(url,"https://www.saucedemo.com/");
 Assert.assertEquals(url, ReadData.ReadExcelFile(0,2));
		
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
			
	CaptureScreenShot.screenShot(it.getName());
		}
		driver.close();
	}
	
	
}
