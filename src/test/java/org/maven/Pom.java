package org.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Pom {
	public static void main(String[] args) throws IOException, InterruptedException {
		Baseclass lib = new Baseclass();
		
		WebDriver driver = lib.lauchBrowser("chrome");
		lib.getWebsite("http://adactinhotelapp.com/");
		
		//Page 1 log in
		LogInPage lp = new LogInPage();
		
		lib.setText(lp.getTxtUserName(), lib.getTextExcel(1, 0));
		lib.setText(lp.getTxtpwd(), lib.getTextExcel(1, 1));
		lib.clickButton(lp.getBtnlogin());
		
		//Booking page
		lib.selectoption(lp.getTxtLoc(), 2);
		lib.selectoption(lp.getTxtHotel(), 3);
		lib.selectoption(lp.getTxtRoom(), 2);
		lib.selectoption(lp.getNoOfRooms(), 2);
		lib.setText(lp.getInDate(), "20/10/2021");
		lib.setText(lp.getOutDate(), "21/10/2021");
		lib.selectoption(lp.getAdultRoom(), 4);
		lib.selectoption(lp.getChldRoom(), 3);
		lib.clickButton(lp.getBtnSearch());
		
		//confirm page
		lib.clickButton(lp.getRadioBtn());
		lib.clickButton(lp.getContinueBtn());
		
		//payment page
		lib.setText(lp.getTxtFistName(), "suresh");
		lib.setText(lp.getTxtLastName(), "Raina");
		lib.setText(lp.getTxtAddress(), "chennai");
		lib.setText(lp.getCardNo(), "9876543219876541");
		lib.selectoption(lp.getCardType(), 2);
		lib.selectoption(lp.getExpMonth(), 6);
		lib.selectoption(lp.getExpYear(), 8);
		lib.setText(lp.getCvv(), "456");
		lib.clickButton(lp.getBookBtn());
	
		Thread.sleep(5000);
		String orderNO = lib.getElementText(lp.getOrderId());
		
		System.out.println("Order number :"+orderNO);
		
		
	}
	
	
	

}
