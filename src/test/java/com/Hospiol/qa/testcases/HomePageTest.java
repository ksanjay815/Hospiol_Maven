package com.Hospiol.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Hospiol.qa.base.BaseTest;
import com.Hospiol.qa.pages.AppointmentPage;
import com.Hospiol.qa.pages.HomePage;
import com.Hospiol.qa.pages.LoginPage;

public class HomePageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.VerifyLoginPage(); // using hp bcoz after login landing on homepage(hp)
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void verifyHometPageTitleTest() throws Throwable {

		System.out.println(driver.getTitle());

	}

	@Test
	public void verifyAppointmentPageTest() throws Throwable {

		homepage.verifyAppointmentPage();
		Thread.sleep(2000);

	}

}
