package com.nopCommerce.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.actiondrivers.Action;
import com.nopCommerce.base.BaseClass;

public class ShoppingCartPage extends BaseClass{
	
		@FindBy(xpath="//*[@name='itemquantity11230']")
		WebElement HTCquantity;
	
		@FindBy(xpath="//*[@class='common-buttons']/a")
		WebElement EstimateBtn;
		
		@FindBy(id="CountryId")
		WebElement countryName;
		
		@FindBy(id="ZipPostalCode")
		WebElement postalCode;
	
		@FindBy(xpath="//*[@id=\"estimate-shipping-popup\"]/div[5]/button")
		WebElement applyBtn;
		
		@FindBy(xpath="//*[@id=\"estimate-shipping-popup\"]/div[4]/div[2]/div[2]/div[1]/label")
		WebElement nextDayAir;
		
		public ShoppingCartPage() {
			PageFactory.initElements(getDriver(), this);
		}
	
		public void enteringHTCQuantity() {
			Action.type(HTCquantity, "3");
		}
		public void clickOnEstimate() throws Throwable {
			Action.click(getDriver(), EstimateBtn);
			Action.switchToDefaultFrame(getDriver());
			Action.selectByVisibleText(countryName, "india");
			Action.type(postalCode, "517644");
			Action.click(getDriver(), nextDayAir);
		}
		public void clickOnApply() {
			Action.click(getDriver(), applyBtn);
		}

}
