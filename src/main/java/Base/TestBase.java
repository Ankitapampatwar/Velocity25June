package Base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	//we have made webdriver static because we need a single copy of driver throughout our project for all the pages
	
	public static WebDriver driver;
	public void initialization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.saucedemo.com/");
		driver.get(ReadData.ReadPropertyFile("url"));
	}

}
