package com.nopCommerce.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopCommerce.base.BaseClass;
import com.nopCommerce.pageobject.HomePage;
import com.nopCommerce.pageobject.IndexPage;
import com.nopCommerce.pageobject.LoginPage;
import com.nopCommerce.pageobject.RegisterPage;

public class LoginPageTest extends BaseClass{
	IndexPage indexPage;
	RegisterPage registerPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	
	@Test
	public void loginTest() throws InterruptedException {
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickLogin();
		Thread.sleep(2000);
		loginPage.loginCustomer(prop.getProperty("email"), prop.getProperty("password"));
		Thread.sleep(2000);
		if(getDriver().getTitle().equals("nopCommerce demo store"))
		{
			Assert.assertTrue(true);
			logger.info("login test pass");
		}else {
			Assert.assertTrue(false);
			logger.info("login test fail");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
