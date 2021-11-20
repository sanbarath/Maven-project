package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	static WebDriver driver = null;
	
	public WebDriver lauchBrowser(String browsername) {
			
		if (browsername.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		}if (browsername.equals("ie")) {
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			}
		return driver;
				
	}
	
	public void getWebsite(String url) {
	driver.get(url);
	}
	
	public void setText(WebElement e, String string) {
	e.sendKeys(string);   
    }
	
	public void selectoption(WebElement element, int index ) {
	Select s = new Select(element);
    s.selectByIndex(index);
        
        
    }
	public String getElementText(WebElement element ) {
		String string = element.getAttribute("value");
		
		return string;
		}

	
	public String  getTextExcel( int row, int cell) throws IOException {
		File location = new File("C:\\Users\\nagaraj\\eclipse-workspace\\MavenDay1\\Excel\\Mobile.xlsx");
		FileInputStream stream = new FileInputStream(location);
		Workbook  w = new XSSFWorkbook(stream);
		String string = null;
		
		Sheet s = w.getSheet("Booking");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		
		if (type==1) {
			string = c.getStringCellValue();
			
		}if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				string    = sdf.format(date);
				
			} else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				string = String.valueOf(l);

			}
			 
}
		return string;
		
		
		
}
	public String  getText(WebElement e) {
		String string = e.getText();
		
		return string;
		

	}	
	public void clickButton(WebElement e) {
		e.click();
			

		}
		 
			
		
		
		
		
			
					}

				
				
				
		

	
	
	
	
	
	

	
		
		
		
	
	
	
		 
		

	
	

	

