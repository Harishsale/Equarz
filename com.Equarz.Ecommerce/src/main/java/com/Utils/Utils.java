package com.Utils;

import com.Pageobjects.homepage;
import com.base.Testbase;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
public class Utils {
	//C:\Users\Dell\git\Eccomerce_Project\com.Equarz.Ecommerce\src\main\java\com\testdata\Test.xlsx

	
	@DataProvider

     public String [][] setdata() throws Throwable{

		File file=new File("C:\\Users\\Dell\\git\\Eccomerce_Project\\com.Equarz.Ecommerce\\src\\main\\java\\com\\testdata\\Test.xlsx");
        FileInputStream stream = new FileInputStream(file);
       XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(1).getLastCellNum();
		String[][] data = new String[rows - 1][columns];

		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < columns; j++) {
	DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		return data;
	}
	public  void dropdown(WebElement value, String text) {
		Select sel = new Select(value);
		sel.selectByValue(text);

	}
	public homepage Windowhandless(String window)
	{
		Set<String> handles = driver.getWindowHandles();
		for (String hand : handles) {
			if (!window.equals(hand)) {
				driver.switchTo().window(hand);
				driver.manage().window().maximize();
				
				
			}
		}
		return new homepage();
	}
	
}




