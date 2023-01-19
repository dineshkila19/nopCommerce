package com.nopCommerce.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.actiondrivers.Action;
import com.nopCommerce.base.BaseClass;

public class LoginPage extends BaseClass {
	
	

	@FindBy(xpath="//input[@class='email']")
	WebElement txtLoginEmail;
	
	@FindBy(xpath="//input[@class='password']")
	WebElement txtLoginPassword;
	
	@FindBy(xpath="//input[@id='RememberMe']")
	WebElement clickOnLoginCheckBox;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement clickOnLoginBtn;
	
	@FindBy(xpath="//*[@class='header-links']/ul/li[4]/a")
	WebElement ShoppingCartBtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage loginCustomer(String uemail, String upassword) {
		Action.type(txtLoginEmail, uemail);
		Action.type(txtLoginPassword, upassword);
		Action.click(getDriver(), clickOnLoginCheckBox);
		Action.click(getDriver(), clickOnLoginBtn);
		return new HomePage();
	}
	
	
	
	
	
	public ShoppingCartPage clickOnShoppingCart() {
		Action.click(getDriver(), ShoppingCartBtn);
		return new ShoppingCartPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
