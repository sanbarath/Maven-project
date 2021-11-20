package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskDay1 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("santhos");
		
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("987654");
		
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
		
		
		
		
		
	}
 
}
