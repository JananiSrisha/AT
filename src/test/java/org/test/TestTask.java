package org.test;

import java.util.Date;

import org.baseclass.BaseClass;
import org.pom.LoginPojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestTask extends BaseClass {

	
	@Test(retryAnalyzer=Failed.class)
	private void tc1() {
		launchUrl("http://adactinhotelapp.com/");
		String title = getTitle();
		LoginPojo l = new LoginPojo();
		sendKeys(l.getUsernamepojo(), "janani@123");
		sendKeys(l.getPasswordpojo(), "janani");
		Assert.assertTrue(title.contains("facebook"));
		click(l.getLoginpojo());
		
	}
	
	
	@Test
	private void tc6()  {
		launchUrl("http://adactinhotelapp.com/");
		LoginPojo l = new LoginPojo();
		sendKeys(l.getUsernamepojo(), "srisha@678");
		sendKeys(l.getPasswordpojo(), "srisha");
		click(l.getLoginpojo());
	}
	
	@Test
	private void tc4()  {
		launchUrl("http://adactinhotelapp.com/");
		LoginPojo l = new LoginPojo();
		sendKeys(l.getUsernamepojo(), "srinivasan@123");
		sendKeys(l.getPasswordpojo(), "srinivasan");
		click(l.getLoginpojo());
	
	}
	
	
	@BeforeClass
	private void startTime() {
		  browserLaunch();
         maxBrowser();
		
		}
	
    @AfterClass	
    private void endTime() {
    	close();
    }
  
}
