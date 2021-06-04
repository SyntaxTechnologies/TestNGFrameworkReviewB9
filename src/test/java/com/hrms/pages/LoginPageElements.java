package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class LoginPageElements extends CommonMethods{
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
	
}
