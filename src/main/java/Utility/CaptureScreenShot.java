package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CaptureScreenShot extends TestBase {
	
	// public static void screenShot() throws Exception
 public static void screenShot(String name) throws Exception
	
	{
		
		
File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File   dest =  new File("C:\\Users\\HP\\eclipse-workspace\\SELENIUM\\Screenshot/"+name+"jpeg");
  FileHandler.copy(Source, dest);
	}

}
//File   dest =  new File("C:\\Users\\HP\\eclipse-workspace\\SELENIUM\\Screenshot/photo3.jpeg");