package com.Hospiol.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Hospiol.qa.base.BaseTest;
import com.Hospiol.qa.pages.AppointmentPage;
import com.Hospiol.qa.pages.HomePage;
import com.Hospiol.qa.pages.LoginPage;

public class AppointmentPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	AppointmentPage appointmentpage;

	public AppointmentPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		appointmentpage = new AppointmentPage();
		homepage = loginpage.VerifyLoginPage();
		homepage.verifyAppointmentPage();
		Thread.sleep(2000);
	}

//	@AfterMethod
//	public void teardown() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.quit();
//	}

	@Test
	public void verifyAddAppointmentBtnTest() throws Throwable {
		System.out.println(driver.getTitle());

		appointmentpage.verifyAddAppointmentBtn();
	}

	@Test
	public void verifyTheAddAppointmentPageByAddingNewPatientDataTest() throws Throwable {
		
		appointmentpage.verifyAddAppointmentBtn();
		appointmentpage.verifyTheAddAppointmentPageByAddingNewPatientData();
	}

}
