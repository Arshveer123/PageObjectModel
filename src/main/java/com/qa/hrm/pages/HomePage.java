package com.qa.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement button;
	
	@FindBy(css="img[alt='company-branding']")
	WebElement logo;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String homepageTitle() {
		return driver.getTitle();
	}
    
	public boolean homepageLogo() {
		return logo.isDisplayed();
	}
	
	public LoginPage clickOnButton(String usr, String pwd) {
		username.sendKeys(usr);
		password.sendKeys(pwd);
		button.click();
		return new LoginPage();
	}
	
}
