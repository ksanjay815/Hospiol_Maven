package com.Hospiol.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Hospiol.qa.base.BaseTest;
import com.Hospiol.qa.pages.HomePage;
import com.Hospiol.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void VerifyLoginPageTest() throws Throwable {
		homepage = loginpage.VerifyLoginPage(); // hp(homepage) is used bcoz after login it will redirect to
														// homepage

	}

}
