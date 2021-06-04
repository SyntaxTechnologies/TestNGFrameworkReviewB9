package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class Login extends CommonMethods{
	
	@Test
	public void logoValidation() {
		
		LoginPageElements login=new LoginPageElements();
		Assert.assertTrue(displayed(login.logo));
		
	}

}
