package com.nopCommerce.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.actiondrivers.Action;
import com.nopCommerce.base.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath="//*[@class='header-logo']/a/img")
	WebElement nopLogo;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@class='header-links']/ul/li[1]/a")
	WebElement RegisterBtn;
	
	@FindBy(xpath="//*[@class='header-links']/ul/li[2]/a")
	WebElement LoginBtn;
	
	@FindBy(xpath="//*[@class='top-menu notmobile']/LI[2]/a")
	WebElement ElectronicsBtn;
	
	
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateLogo() {
		return Action.isDisplayed(getDriver(), nopLogo);
	}
	
	
	public boolean validateSearchBox() {
		return Action.isDisplayed(getDriver(), searchBox);
	}
	
	public RegisterPage clickOnRegister() {
		Action.click(getDriver(), RegisterBtn);
		return new RegisterPage();
	}
	
	public LoginPage clickLogin() {
		Action.click(getDriver(), LoginBtn);
		return new LoginPage();
	}
	
	public ElectronicsPage clickOnElectronicBtn() {
		Action.click(getDriver(), ElectronicsBtn);
		return new ElectronicsPage();
	}
	

}
