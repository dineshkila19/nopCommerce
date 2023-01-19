package com.nopCommerce.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopCommerce.base.BaseClass;
import com.nopCommerce.pageobject.ElectronicsPage;
import com.nopCommerce.pageobject.HomePage;
import com.nopCommerce.pageobject.IndexPage;
import com.nopCommerce.pageobject.LoginPage;
import com.nopCommerce.pageobject.ShoppingCartPage;

public class ShoppingCartPageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	ElectronicsPage electronicsPage;
	ShoppingCartPage shoppingCartPage;
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	
	@Test
	public void ShoppingCartTest() {
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickLogin();
		homePage=loginPage.loginCustomer(prop.getProperty("email"), prop.getProperty("password"));
		//shoppingCartPage=homePage.clickOnShoppingCart();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
