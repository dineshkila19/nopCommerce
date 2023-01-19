package com.nopCommerce.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopCommerce.base.BaseClass;
import com.nopCommerce.pageobject.ElectronicsPage;
import com.nopCommerce.pageobject.HomePage;
import com.nopCommerce.pageobject.IndexPage;
import com.nopCommerce.pageobject.LoginPage;

public class ElectronicsPageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	ElectronicsPage electronicsPage;
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	
	@Test
	public void FindElectronicsTest() {
		IndexPage indexPage =new IndexPage();
		electronicsPage=indexPage.clickOnElectronicBtn();
		electronicsPage.selectCellPhones();
		electronicsPage.selectHTCmini();
		electronicsPage.enterQuantity();
		electronicsPage.clickOnAddToCartBtn();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
