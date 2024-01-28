package com.Hospiol.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hospiol.qa.base.BaseTest;

public class HomePage extends BaseTest {

	//@FindBy(xpath = "//span[text()=\"Appointment\"]")
	@FindBy(xpath="//span[normalize-space()='Appointment']")
	
	@CacheLookup
	private WebElement appointment;

	public HomePage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}

	public  AppointmentPage verifyAppointmentPage() throws Throwable  {
		appointment.click();
		Thread.sleep(2000);
		return new AppointmentPage();
		
	}

}
