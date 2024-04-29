package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectHotelPojo extends BaseClass{
	
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		@FindBy(id="radiobutton_0"),
		@FindBy(name="radiobutton_0"),
		@FindBy(xpath="//input[@type='radio']")
	})
	private WebElement selectHotel;

	@CacheLookup
	@FindAll({
		@FindBy(id="continue"),
		@FindBy(name="continue"),
		@FindBy(xpath="//input[@type='submit']")
	})
	private WebElement clickContinue;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="cancel"),
		@FindBy(name="cancel"),
		@FindBy(xpath="//input[@type='button']")
	})
	private WebElement cancel;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
}
