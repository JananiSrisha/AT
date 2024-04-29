package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookHotelPojo extends BaseClass{

	public BookHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//a[@href='SelectHotel.php']")
	})
	private WebElement back;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="first_name"),
		@FindBy(name="first_name"),
		@FindBy(xpath="(//input[@class='reg_input'])[1]"),
		@FindBy(xpath="//input[@fdprocessedid='bx6wqi']")
	})
	private WebElement firstName;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="last_name"),
		@FindBy(name="last_name"),
		@FindBy(xpath="(//input[@class='reg_input'])[2]"),
		@FindBy(xpath="//input[@fdprocessedid='12c738']")
	})
	private WebElement lastName;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="address"),
		@FindBy(name="address"),
		@FindBy(xpath="//textarea[@class='txtarea']")
	})
	private WebElement billingAddress;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="cc_num"),
		@FindBy(name="cc_num"),
		@FindBy(xpath="(//input[@onkeypress='return OnlyNumbersonly(event)'])[1]"),
		@FindBy(xpath="(//input[@class='reg_input'])[3]")
	})
	private WebElement creditCardNo;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="cc_type"),
		@FindBy(name="cc_type"),
		@FindBy(xpath="//select[@class='select_combobox']")
	})
	private WebElement creditCardType;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="cc_exp_month"),
		@FindBy(name="cc_exp_month"),
		@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	})
	private WebElement selectMonth;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="cc_exp_year"),
		@FindBy(name="cc_exp_year"),
		@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	})
	private WebElement selectYear;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="cc_cvv"),
		@FindBy(name="cc_cvv"),
		@FindBy(xpath="(//input[@onkeypress='return OnlyNumbersonly(event)'])[2]")
	})
	private WebElement cvvNumber;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="book_now"),
		@FindBy(name="book_now"),
		@FindBy(xpath="//input[@value='Book Now']"),
	})
	private WebElement bookNow;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="cancel"),
		@FindBy(name="cancel"),
		@FindBy(xpath="//input[@value='Cancel']"),
	})
	private WebElement cancel;

	
	public WebElement getBack() {
		return back;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
