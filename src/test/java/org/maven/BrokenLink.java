package org.maven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println(totalLinks.size());

		int count=0;
		int brokencount=0;
		for (int i = 0; i < totalLinks.size(); i++) {
			WebElement element = totalLinks.get(i);
			String link = element.getAttribute("href");
 
			if (link != null) {

				URL url = new URL(link);
				URLConnection openConnection = url.openConnection();
				HttpURLConnection http = (HttpURLConnection) openConnection;
				int responseCode = http.getResponseCode();

				if (responseCode == 200) {
					System.out.println("Success Link-----" + link);
					count++;

				} else {
					System.out.println("Unsucces Link----" + link);
					
				brokencount++;

				}

			}

		}
		
		System.out.println("No.of successlink=="+ count);
		System.out.println("No.of Unsuccess link==" +brokencount);
		
		

	}

}
