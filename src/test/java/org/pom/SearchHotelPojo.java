package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;


public class SearchHotelPojo extends BaseClass{

	public SearchHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		     @FindBy(xpath="//select[@id='location']"),
		     @FindBy(xpath="//select[@name='location']"),
		     @FindBy(xpath="(//select[@class='search_combobox'])[1]")
	        })
	private WebElement location;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="hotels"),
		@FindBy(name="hotels"),
		@FindBy(xpath="(//select[@class='search_combobox'])[2]")
	})
	private WebElement hotels;

	@CacheLookup
	@FindAll({
		@FindBy(id="room_type"),
		@FindBy(name="room_type"),
		@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	})
	private WebElement roomType;

	@CacheLookup
	@FindAll({
		@FindBy(id="room_nos"),
		@FindBy(name="room_nos"),
		@FindBy(xpath="(//select[@class='search_combobox'])[4]")
	})
	private WebElement numberOfRooms;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="datepick_in"),
		@FindBy(name="datepick_in"),
		@FindBy(xpath="//input[@fdprocessedid='r88uzh']")
	})
	private WebElement checkInDate;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="datepick_out"),
		@FindBy(name="datepick_out"),
		@FindBy(xpath="//input[@fdprocessedid='t2kveu']")
	})
	private WebElement checkOutDate;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="adult_room"),
		@FindBy(name="adult_room"),
		@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	})
	private WebElement adultsPerRoom;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="child_room"),
		@FindBy(name="child_room"),
		@FindBy(xpath="(//select[@class='search_combobox'])[6]")
	})
	private WebElement childrenPerRoom;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="Submit"),
		@FindBy(name="Submit"),
		@FindBy(xpath="//input[@type='submit']")
	})
	private WebElement search;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="Reset"),
		@FindBy(name="Reset"),
		@FindBy(xpath="//input[@type='reset']")
	})
	private WebElement reset;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
