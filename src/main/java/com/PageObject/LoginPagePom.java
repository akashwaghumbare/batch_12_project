package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePom {

	@FindBy(how=How.XPATH,using = "//input[@type='text']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using ="//input[@type='password']")
	private WebElement Pass;
	
	@FindBy(how=How.XPATH,using ="//button[@name='login']")
	private WebElement Login_btn;

	public WebElement getEmail() {
		return Email;
	}

		public WebElement getPass() {
		return Pass;
	}

	
	public WebElement getLogin_btn() {
		return Login_btn;
	}
	
}
