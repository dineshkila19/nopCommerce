package com.nopCommerce.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopCommerce.base.BaseClass;
import com.nopCommerce.pageobject.RegisterPage;
import com.nopCommerce.utilities.XLUtils;

public class TC_RegisterDDT_001 extends BaseClass{
	
	@Test(dataProvider="RegisterData")
	public void registerDDT(String firstname, String lastname, String email, String companyname, String password, String confirmpassword) 
	{
		RegisterPage registerPage=new RegisterPage();
		registerPage.setFirstname(firstname);
		registerPage.setLastname(lastname);
		registerPage.selectDOB();
		registerPage.setEmail(email);
		registerPage.setCompanyname(companyname);
		registerPage.setPassword(password);
		registerPage.setConfirmPassword(confirmpassword);
		registerPage.clickOnSubmitBtn();
		
		if(isAlertPresent()==true)
		{
			getDriver().switchTo().alert().accept();
			getDriver().switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	
	public boolean isAlertPresent()
	{
		try
		{
			getDriver().switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;	
		}
		
	
	}
	@DataProvider(name="RegisterData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/nopCommerce/testData/testData.xls";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String registerdata[][]=new String[rownum][colcount];
		for(int i=1; i<=rownum; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				registerdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return registerdata;
	}
	

}
