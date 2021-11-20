package org.maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3ExcelWrite {
	public static void main(String[] args) throws IOException {
		
		File loc = new File ("C:\\Users\\nagaraj\\eclipse-workspace\\MavenDay1\\Excel\\Mobile.xlsx");
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Model");
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement p = driver.findElement(By.xpath("//input[@type='text']"));
		p.sendKeys("iphone",Keys.ENTER);
		List<WebElement> l = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		    
		for (int i = 0; i < l.size(); i++) {
		
			 Row r = s.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(l.get(i).getText());
			
		}
		
		FileOutputStream outstream = new FileOutputStream(loc);
		w.write(outstream);
		
		System.out.println("done");
		}
		
			
	
	}
	


