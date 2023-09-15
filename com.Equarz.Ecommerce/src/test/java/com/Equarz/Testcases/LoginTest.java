package com.Equarz.Testcases;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class LoginTest extends Testbase {
	
	Login_Functionality lg;
	
	public LoginTest() {
		
		super();
		
		
		
	}
       @BeforeMethod
       public void signin() {
    	   
    	   Setup();
    	   lg=new Login_Functionality(driver);
       }
       @Test
       public void verifylogin() throws Throwable {
    	   
    	  lg.Login();
       }

}
