package org.pages;

import org.basee.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel extends BaseClasss {
	
	public selectHotel() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement select;
	
	@FindBy(id="continue")
	private WebElement continuee;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinuee() {
		return continuee;
	}


}
