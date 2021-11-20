package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Baseclass {

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtpwd;

	@FindBy(id = "login")
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpwd() {
		return txtpwd;
	}

	public WebElement getBtnlogin() {
		return btnlogin;

	}

	@FindBy(id = "location")
	private WebElement txtLoc;
	@FindBy(id = "hotels")
	private WebElement txtHotel;
	@FindBy(id = "room_type")
	private WebElement txtRoom;

	public WebElement getTxtLoc() {
		return txtLoc;
	}

	public WebElement getTxtHotel() {
		return txtHotel;
	}

	public WebElement getTxtRoom() {
		return txtRoom;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChldRoom() {
		return chldRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	@FindBy(id = "room_nos")
	private WebElement noOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement inDate;
	@FindBy(id = "datepick_out")
	private WebElement outDate;
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	@FindBy(id = "child_room")
	private WebElement chldRoom;
	@FindBy(id = "Submit")
	private WebElement btnSearch;

	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;
	@FindBy(id = "continue")
	private WebElement continueBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	@FindBy(id = "first_name")
	private WebElement txtFistName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(id = "cc_num")
	private WebElement cardNo;
	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement bookBtn;
	@FindBy(id = "order_no")
	private WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getTxtFistName() {
		return txtFistName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

}
