package org.test;

import org.baseclass.BaseClass;
import org.testng.annotations.Test;

public class B extends BaseClass {
	
	@Test
	private void tc25() {
		System.out.println("tc25 : "+Thread.currentThread().getId());
		  browserLaunch();
		  launchUrl("https://www.redbus.in");
	}
	@Test
	private void tc22() {
		System.out.println("tc22 : "+Thread.currentThread().getId());
		launchUrl("https://www.facebook.com/");
	}
	@Test
	private void tc27() {
		System.out.println("tc27 : "+Thread.currentThread().getId());
		launchUrl("https://chat.openai.com/");
	}

}
