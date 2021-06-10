package com.ecommerce.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {

	
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(1000);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Dashboard / nopCommerce administration","Matches");
	lp.clickLogout();
	/*if(title.equals("Dashboard / nopCommerce administration")) {
		Assert.assertTrue(true);
		lp.clickLogout();
	}*/
	}
	
	
}
