package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase{
	@FindBy(xpath = " //div[@class=\"login_logo\"] ")private WebElement loginLogo;
	@FindBy(xpath = "//div[@class=\"bot_column\"] ")private WebElement botLogo;
	@FindBy(xpath = "//input[@name=\"user-name\"]")private WebElement userName;
	@FindBy(xpath = "//input[@name=\"password\"]")private WebElement password;
	@FindBy(xpath = " //input[@name=\"login-button\"]")private WebElement submitBtn;
	@FindBy(xpath="//Span[text()='Products']")private WebElement productLabel;
	
	//constructor gets executed without calling whenever object is created and we have created a object login in another class
	//that is why we are using constructor here
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		//we are using driver here because we need to connect all the webelements
		//we are using this here because we need to connect webelement with driver for this class
	}
	
	//we are not using driver.findelement method here because it will execute the elements on single page
	//if they are on different page it needs to be executed separately but this method doesn't have that problem
	 public String loginToApp() throws Exception
	 {
		// userName.sendKeys("standard_user");
		 userName.sendKeys(ReadData.ReadPropertyFile("username"));
		// password.sendKeys("secret_sauce");
		 password.sendKeys(ReadData.ReadPropertyFile("password"));
		 submitBtn.click();
		return productLabel.getText();
		 
	}
	public String loginToApp2() throws Exception
	{
		loginToApp();
		return driver.getCurrentUrl();
	}
	
	//method to verify the title
	public String verifyTitle() 
	{
		return driver.getTitle();   
		//this method is giving us some output and returning something that is why we wrote return here
		
	}
	
	//method to verify the URL
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}

}
