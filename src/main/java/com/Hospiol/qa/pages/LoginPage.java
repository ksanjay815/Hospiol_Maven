package com.Hospiol.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hospiol.qa.base.BaseTest;

public class LoginPage extends BaseTest {

	public LoginPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement uname;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//button[text()=\"Sign In\"]")
	private WebElement signInBtn;

	public HomePage VerifyLoginPage() throws Throwable {
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
//		uname.sendKeys("sampath.marolix@gmail.com");
//		pass.sendKeys("sampath@777");
		signInBtn.click();
		return new HomePage();
	}
}