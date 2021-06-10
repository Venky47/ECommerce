package com.ecommerce.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.pageObjects.LoginPage;

public class TC_LoginPageTest_001 extends BaseClass {

	
	
	@Test
	public void loginTest() throws InterruptedException {
		logger.info("-----------TC_LoginPageTest_001------------");
		driver.get(baseURL);
		Thread.sleep(1000);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickLogin();
		logger.info("login clicked");
		
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Dashboard / nopCommerce administration","Matches");
	logger.info("Title matches");
	lp.clickLogout();
	logger.info("logged out");
	/*if(title.equals("Dashboard / nopCommerce administration")) {
		Assert.assertTrue(true);
		lp.clickLogout();
	}*/
	}
	
	
}
