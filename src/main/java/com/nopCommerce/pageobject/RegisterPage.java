package com.nopCommerce.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.actiondrivers.Action;
import com.nopCommerce.base.BaseClass;

public class RegisterPage extends BaseClass{
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement maleRadio;
	
	@FindBy(id="FirstName")
	WebElement txtFirstname;
	
	@FindBy(id="LastName")
	WebElement txtLastname;
	
	@FindBy(xpath="//*[@name='DateOfBirthDay']")
	WebElement dayDrop;
	
	@FindBy(xpath="//*[@name='DateOfBirthMonth']")
	WebElement monthDrop;
	
	@FindBy(xpath="//*[@name='DateOfBirthYear']")
	WebElement yearDrop;
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Company")
	WebElement txtCompanyname;
	
	@FindBy(xpath="//*[@type='checkbox']")
	WebElement newsChechBox;
	
	@FindBy(xpath="//*[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@name='ConfirmPassword']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//*[@name='register-button']")
	WebElement clickSubmitBtn;
	
	@FindBy(xpath="//*[@class='buttons']/a")
	WebElement continueBtn;
	
	public RegisterPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public void selectGender() {
		Action.click(getDriver(), maleRadio);
	}
	
	public void setFirstname(String ufname) {
		Action.type(txtFirstname, ufname);
	}
	
	public void setLastname(String ulname) {
		Action.type(txtLastname, ulname);
	}
	
	public void selectDOB() {
		Action.selectByIndex(dayDrop, 18);
		Action.selectByIndex(monthDrop, 5);
		Action.selectByVisibleText(yearDrop, "1995");
	}
	
	public void setEmail(String uemail) {
		Action.type(txtEmail, uemail);
		
	}
	
	public void setCompanyname(String ucompany) {
		Action.type(txtCompanyname, ucompany);
	}
	
	public void selectNewsCheckBox() {
		Action.click(getDriver(), newsChechBox);
	}
	
	public void setPassword(String upassword) {
		Action.type(txtPassword, upassword);
	}
	
	public void setConfirmPassword(String ucpassword) {
		Action.type(txtConfirmPassword, ucpassword);
	}
	
	public HomePage clickOnSubmitBtn() {
		Action.click(getDriver(), clickSubmitBtn);
		return new HomePage();
	}
	
	
	public HomePage clickOnContinue() {
		  Action.click(getDriver(), continueBtn);
		  return new HomePage();
	}
	
	
	

}
