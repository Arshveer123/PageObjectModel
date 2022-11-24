package com.qa.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(css=".oxd-userdropdown-name")
	WebElement usrname;
	 
	@FindBy(xpath="(//*[name()='svg' and @class='oxd-icon'])[5]")
	WebElement AssignLleave;
	
	@FindBy(css=".orangehrm-attendance-card-details")
	WebElement punchoutTime;

}
