package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Bannersearch;
import com.Pageobjects.Categorysearch;
import com.Pageobjects.Footbanner;
import com.Pageobjects.Homesearch;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Searchcart;
import com.base.Testbase;

public class Cart extends Testbase{
	
	Bannersearch bs;
	Categorysearch cs;
	Footbanner fb;
	Homesearch hs;
	Searchcart sct;
	Login_Functionality lf;
	
	
	
	public Cart () {
		
		super();
		
		
	}
     
	@BeforeMethod
	
	public void initialization() throws Throwable {
		Setup();
		bs=new Bannersearch(driver);
		cs=new Categorysearch(driver);
		fb=new Footbanner(driver);
		hs=new Homesearch(driver);
		sct=new Searchcart(driver);
		lf=new Login_Functionality(driver);
		lf.Login();
		
		
	}
	
	
	@Test
	
	public void Verifyhomecart() throws Throwable {
		
		      bs.Bannercart1();
	
	}
	
	@AfterMethod
	
	public void close() {
		
		driver.close();
		
	}
	
}
