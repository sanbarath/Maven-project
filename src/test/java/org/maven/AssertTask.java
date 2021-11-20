package org.maven;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class AssertTask {
	static WebDriver driver;
	
	@Test
	public void tcs1() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("adact");
		Assert.assertTrue("verify url",contains);
	}
		
		
	@Test
	public void tcs2() {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("santhoshbarath");
		String attribute = txtUser.getAttribute("value");
		boolean contains = attribute.contains("san");
		Assert.assertTrue("verify username", contains);
		
		driver.findElement(By.id("password")).sendKeys("987654");
		driver.findElement(By.id("login")).click();
		driver.quit();
		
	}
	}          

	
	
	
   

	

	


