package com.ecommerce.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.pageObjects.LoginPage;
import com.ecommerce.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		logger.info("-----------TC_LoginDDT_002------------");
		driver.get(baseURL);
		Thread.sleep(1000);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("Username entered");
		lp.setPassword(pwd);
		logger.info("Password entered");
		lp.clickLogin();
		logger.info("login clicked");
		
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
			//captureScreen(driver, "TC_LoginPageTest_001");
			Assert.assertTrue(false);
			lp.clickLogout();
			logger.info("logged out");
			
		}
	
		
	}
	
	
	
	
	
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		//C:\Users\Hp\git\ECommerse\ECommerce\src\test\java\com\ecommerce\testData\LoginData.xlsx
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\ecommerce\\testData\\LoginData.xlsx";
		
		//to get row count
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		//to get coloumn count
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
			
		}return logindata;
		
	}
}
		


