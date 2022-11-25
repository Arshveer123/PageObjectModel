package com.qa.hrm.testclass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.LoginPage;
import com.qa.testbase.ExcelSheet;
import com.qa.testbase.TestBase;

public class HomepageTest extends TestBase {
	public static HomePage homepage;
	public static LoginPage loginpage;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		homepage = new HomePage();
	}

	@AfterMethod()
	public void tearDown() {
		driver.close();
	}

	@Test(priority=1)
	public void homepageTitleTest() {
		String actualTitle = homepage.homepageTitle();
		String expTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expTitle);

	}

	@Test(priority=2)
	public void homepageLogoTest() {
		boolean flag = homepage.homepageLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority=3)
	public void loginTest() {

		loginpage = homepage.clickOnButton(prop.getProperty("username"), prop.getProperty("password"));
	}

	@DataProvider()
	public Object[][] getDataFromExcel() {
		Object[][] data = ExcelSheet.getData();
		return data;
	}

	@Test(priority=4, dataProvider="getDataFromExcel")
	public void DataProviderTest(String username,String Password) {
		System.out.println(username+" "+Password);
		
	}
}
