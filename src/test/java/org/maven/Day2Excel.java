package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.SystemUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2Excel {

	
	public static void main(String[] args) throws IOException  {
		
		File excelLoc =new File("C:\\Users\\nagaraj\\eclipse-workspace\\MavenDay1\\Excel\\Profile.xlsx");
		FileInputStream stream =  new FileInputStream(excelLoc);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("Profile");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if (type==1) {
					String string = c.getStringCellValue();
					System.out.println(string);

				}else {
					if (DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						String string = sdf.format(d);
						System.out.println(string);
						
					}else {
						String string = String.valueOf((long)c.getNumericCellValue());
						System.out.println(string);
					}
						
					}
				}
			
				
			}
			
		}
		

		
		
		
	
		
		
		
		
	}

