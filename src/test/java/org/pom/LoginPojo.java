package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPojo extends BaseClass {
	
	public LoginPojo()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernamepojo;
	
	@FindBy(id="password")
	private WebElement passwordpojo;
	
	@FindBy(id="login")
	private WebElement loginpojo;

	public WebElement getUsernamepojo() {
		return usernamepojo;
	}

	public WebElement getPasswordpojo() {
		return passwordpojo;
	}

	public WebElement getLoginpojo() {
		return loginpojo;
	}
	
	
}
