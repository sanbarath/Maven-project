package org.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day5ExcelBase {
	public static void main(String[] args) throws IOException, InterruptedException {
		Baseclass lib = new Baseclass();
		
		WebDriver driver = lib.lauchBrowser("chrome");
		lib.getWebsite("https://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		//String string = lib.getTextExcel(1, 0);
		lib.setText(txtUserName, lib.getTextExcel(1, 0));
	
		WebElement txtpwd = driver.findElement(By.id("password"));
		lib.setText(txtpwd, lib.getTextExcel(1, 1));
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		
		WebElement txtLoc = driver.findElement(By.id("location"));
		lib.setText(txtLoc, lib.getTextExcel(1,2 ));
		WebElement txtHotel = driver.findElement(By.id("hotels"));
		lib.setText(txtHotel, lib.getTextExcel(2, 3));
		WebElement txtRoom = driver.findElement(By.id("room_type"));
		lib.setText(txtRoom, lib.getTextExcel(3, 4));
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		lib.setText(noOfRooms, lib.getTextExcel(3, 5));	
		WebElement inDate = driver.findElement(By.id("datepick_in"));
		lib.setText(inDate, lib.getTextExcel(5,6));
		WebElement outDate = driver.findElement(By.id("datepick_out"));
		lib.setText(outDate, lib.getTextExcel(3, 7));
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		lib.setText(adultRoom, lib.getTextExcel(3, 8));
		WebElement chldRoom = driver.findElement(By.id("child_room"));
		lib.setText(chldRoom, lib.getTextExcel(4, 9));
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
		
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		
		WebElement txtFistName = driver.findElement(By.id("first_name"));
		lib.setText(txtFistName, lib.getTextExcel(1,11));
		
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		lib.setText(txtLastName, lib.getTextExcel(1, 12));
		WebElement txtAddress = driver.findElement(By.id("address"));
		lib.setText(txtAddress, lib.getTextExcel(1, 13));
		WebElement cardNo = driver.findElement(By.id("cc_num"));
		lib.setText(cardNo, lib.getTextExcel(1, 14));
		WebElement cardType = driver.findElement(By.id("cc_type"));
		lib.selectoption(cardType, 3);
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		lib.selectoption(expMonth, 5);
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		lib.selectoption(expYear, 6);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("456");
		
		WebElement bookBtn = driver.findElement(By.id("book_now"));
		bookBtn.click();
	Thread.sleep(5000);
		WebElement orderId = driver.findElement(By.id("order_no"));
		String text = lib.getElementText(orderId);
		
		System.out.println(text);
		
		
		
	      
		
	
	
	
	}
}
