package com.nopCommerce.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.actiondrivers.Action;
import com.nopCommerce.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//*[@class='header-links']/ul/li[4]/a")
	WebElement ShoppingCartBtn;
	
	@FindBy(xpath="//*[@class='header-links']/ul/li[2]/a")
	WebElement LoginBtn;
	
	@FindBy(xpath="//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
	WebElement Electronics;
	
	
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	

	public ShoppingCartPage clickOnShoppingCart() {
		Action.click(getDriver(), ShoppingCartBtn);
		return new ShoppingCartPage();
	}
	
	public LoginPage clickLogin() {
		Action.click(getDriver(), LoginBtn);
		return new LoginPage();
	}
	
	
	 
	
	public ElectronicsPage clickOnElectronics() {
		Action.click(getDriver(), Electronics);
		return new ElectronicsPage();
	}

}
