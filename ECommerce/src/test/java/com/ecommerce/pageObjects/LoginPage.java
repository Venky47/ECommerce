package com.ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver,this);	
	}
	
	//Webelements
	@FindBy(xpath="//input[@type='email']")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(linkText="Logout")
	WebElement lnkLogout;
	
	//Action methods
	public void setUserName(String uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) 
	{
		txtEmail.clear();
		txtpassword.sendKeys(pwd);
	}
    
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
}
