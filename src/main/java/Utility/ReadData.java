package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String ReadPropertyFile(String value) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\FrameworkProject\\TestData\\config.property");
       prop.load(file);
      return  prop.getProperty(value);
	}
	
	public static String ReadExcelFile(int rowNum , int colNum) throws Exception, Exception
	{
		
	FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\FrameworkProject\\TestData\\ReadDataFileExcel.xlsx");
Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
     String value = excel.getRow(rowNum).getCell(colNum).getStringCellValue();
     return value;
	
	}
	
}
