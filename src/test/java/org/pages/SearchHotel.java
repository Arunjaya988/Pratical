package org.pages;

import org.basee.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClasss {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location; 
	
	@FindBy(id="hotels")
	private WebElement hotels; 
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noofRooms; 
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement inDate; 
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement outDate;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adults;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement children;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoofRooms() {
		return noofRooms;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}





	

}
