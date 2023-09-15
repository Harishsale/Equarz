package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Register;
import com.Utils.Utils;
import com.base.Testbase;

public class Registerpage extends Testbase{

	Register Re;

	
	
	public Registerpage () {
		super ();
		
	}
	
	@BeforeMethod 
	public void intailazation  () {
		
		Setup();
		
		Re = new Register(driver);
		 
		
		
		}
	 @Test  ( dataProvider = "setdata", dataProviderClass =  Utils.class)
	 public void VerifyRegi (String first1, String last1 , String emailid1 , String phonenumber1 , String password1 , String confimpass1) throws Exception {
		 Re.VerifyRegistartion(first1, last1, emailid1, phonenumber1, password1, confimpass1);
	 }
	
	
}
