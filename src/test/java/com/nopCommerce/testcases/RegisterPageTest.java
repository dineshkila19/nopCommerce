package com.nopCommerce.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopCommerce.base.BaseClass;
import com.nopCommerce.pageobject.IndexPage;
import com.nopCommerce.pageobject.RegisterPage;

public class RegisterPageTest extends BaseClass{
	IndexPage IndexPage;
	RegisterPage registerPage;
	
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	
	@Test
	public void Register() throws InterruptedException {
		IndexPage IndexPage=new IndexPage();
		registerPage=IndexPage.clickOnRegister();
		Thread.sleep(2000);
		registerPage.selectGender();
		Thread.sleep(2000);
		registerPage.setFirstname("Dinesh");
		Thread.sleep(2000);
		registerPage.setLastname("Kila");
		Thread.sleep(2000);
		registerPage.selectDOB();
		Thread.sleep(2000);
		registerPage.setEmail("dineshkila@gmail.com");
		Thread.sleep(2000);
		registerPage.setCompanyname("Capgemini");
		Thread.sleep(2000);
		registerPage.selectNewsCheckBox();
		Thread.sleep(2000);
		registerPage.setPassword("dinesh19");
		Thread.sleep(2000);
		registerPage.setConfirmPassword("dinesh19");
		Thread.sleep(2000);
		registerPage.clickOnSubmitBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
