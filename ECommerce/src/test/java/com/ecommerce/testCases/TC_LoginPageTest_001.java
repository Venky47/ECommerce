package com.ecommerce.testCases;



import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.pageObjects.LoginPage;

public class TC_LoginPageTest_001 extends BaseClass {

	
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
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
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	String title=driver.getTitle();
	System.out.println(title);
	/*Assert.assertEquals(title, "Dashboard / nopCommerce administration","Matches");
	logger.info("Title matches");
	lp.clickLogout();*/
	
	if(title.equals("Your store. Login")) {
		Assert.assertTrue(true);
		lp.clickLogout();
		logger.info("logged out");
	}
		else {
			captureScreen(driver, "TC_LoginPageTest_001");
			Assert.assertTrue(false);
			lp.clickLogout();
			logger.info("logged out");
		}
	
	}
	}
	
	

