package com.ecommerce.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://admin-demo.nopcommerce.com/";
	public String username="admin@yourstore.com";
	public String password="admin";
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\test\\ECommerce\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
