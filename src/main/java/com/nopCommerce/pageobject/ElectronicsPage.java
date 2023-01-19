package com.nopCommerce.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.actiondrivers.Action;
import com.nopCommerce.base.BaseClass;

public class ElectronicsPage extends BaseClass{
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")
	WebElement CellPhones;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")
	WebElement HTConeMini;
	
	@FindBy(xpath="//*[@class='qty-input valid']")
	WebElement quantity;
	
	@FindBy(xpath="//*[@class='button-1 add-to-cart-button']")
	WebElement addToCartBtn;
	
	public ElectronicsPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void selectCellPhones() {
		Action.click(getDriver(), CellPhones);
	}
	
	public void selectHTCmini() {
		Action.click(getDriver(), HTConeMini);
	}
	
	public void enterQuantity() {
		Action.type(quantity, "2");
	}
	
	public AddToCartPage clickOnAddToCartBtn() {
		Action.click(getDriver(), addToCartBtn);
		return new AddToCartPage();
	}
	
	
	
	
	
}
