package com.nopCommerce.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopCommerce.base.BaseClass;
import com.nopCommerce.pageobject.IndexPage;

public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	@BeforeClass
	public void setUp() {
		launchApp();
		Logger logger=Logger.getLogger("ecommerce");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyNopLogo() {
		IndexPage indexPage=new IndexPage();
		boolean result=indexPage.validateLogo();
		//logger.info("ecommerce LOGO");
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void verifySearchBox() {
		IndexPage indexPage=new IndexPage();
		boolean result1=indexPage.validateSearchBox();
		
		Assert.assertTrue(result1);
		
	}
	
	
	
	
	
	
	
	
	

}
