package org.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {

		Baseclass lib = new Baseclass();
		

		WebDriver driver = lib.lauchBrowser("chrome");

		lib.getWebsite("https://adactinhotelapp.com/");
		
		
		WebElement  txtUsername= driver.findElement(By.id("username"));
		lib.setText(txtUsername, "SanthoshBarath");
		WebElement txtpwd = driver.findElement(By.id("password"));
		lib.setText(txtpwd, "987654");
		
		driver.findElement(By.id("login")).click();
		
        
		WebElement location = driver.findElement(By.id("location"));
		lib.selectoption(location, 5);
		WebElement hotels = driver.findElement(By.id("hotels"));
		lib.selectoption(hotels, 4);
		WebElement type = driver.findElement(By.id("room_type"));
		lib.selectoption(type, 3);
		WebElement numbers = driver.findElement(By.id("room_nos"));
		lib.selectoption(numbers, 4);
		
		WebElement indate = driver.findElement(By.id("datepick_in"));
		lib.setText(indate, "15/10/2021");
		
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		lib.setText(outdate, "16/10/2021");
		WebElement adullts = driver.findElement(By.id("adult_room"));
		lib.selectoption(adullts, 3);
		WebElement child = driver.findElement(By.id("child_room"));
		lib.selectoption(child, 2);
		
		 driver.findElement(By.id("Submit")).click();
		 driver.findElement(By.id("radiobutton_0")).click();
		 driver.findElement(By.id("continue")).click();
		 WebElement sendname = driver.findElement(By.id("first_name"));
		lib.setText(sendname, "Rahul");
		WebElement sendnamel = driver.findElement(By.id("last_name"));
		lib.setText(sendnamel, "vinith");
		WebElement address = driver.findElement(By.id("address"));
		lib.setText(address, "chennai, tamilnadu");
		WebElement cardno = driver.findElement(By.id("cc_num"));
		lib.setText(cardno, "9876543211234569");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		lib.selectoption(cardtype, 4);
		WebElement ce = driver.findElement(By.id("cc_exp_month"));
		lib.selectoption(ce, 6);
		WebElement cey = driver.findElement(By.id("cc_exp_year"));
		lib.selectoption(cey, 10);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		lib.setText(cvv, "456");
		
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(8000);
		WebElement textorderno = driver.findElement(By.id("order_no"));
		String orderno = lib.getElementText(textorderno);
		System.out.println("Order no is :"+orderno);
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
