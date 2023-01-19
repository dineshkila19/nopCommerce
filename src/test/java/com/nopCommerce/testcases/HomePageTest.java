package com.nopCommerce.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopCommerce.base.BaseClass;
import com.nopCommerce.pageobject.ElectronicsPage;
import com.nopCommerce.pageobject.HomePage;
import com.nopCommerce.pageobject.IndexPage;
import com.nopCommerce.pageobject.LoginPage;
import com.nopCommerce.pageobject.RegisterPage;

public class HomePageTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	ElectronicsPage electronicsPage;
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
	public void HomePageTest() throws InterruptedException {
		
		IndexPage IndexPage=new IndexPage();
		registerPage=IndexPage.clickOnRegister();
		Thread.sleep(2000);
		registerPage.selectGender();
		Thread.sleep(2000);
		registerPage.setFirstname("Bablu");
		Thread.sleep(2000);
		registerPage.setLastname("Kila");
		Thread.sleep(2000);
		registerPage.selectDOB();
		Thread.sleep(2000);
		registerPage.setEmail("bablukila3@gmail.com");
		Thread.sleep(2000);
		registerPage.setCompanyname("Capgemini");
		Thread.sleep(2000);
		registerPage.selectNewsCheckBox();
		Thread.sleep(2000);
		registerPage.setPassword("bablu19");
		Thread.sleep(2000);
		registerPage.setConfirmPassword("bablu19");
		Thread.sleep(2000);
		registerPage.clickOnSubmitBtn();
		homePage=registerPage.clickOnContinue();
		loginPage=homePage.clickLogin();
		homePage=loginPage.loginCustomer(prop.getProperty("email"), prop.getProperty("password"));
		//loginPage.clickOnShoppingCart();
		electronicsPage=homePage.clickOnElectronics();
		electronicsPage.selectCellPhones();
		electronicsPage.selectHTCmini();
		electronicsPage.enterQuantity();
		electronicsPage.clickOnAddToCartBtn();
		
	}

}
