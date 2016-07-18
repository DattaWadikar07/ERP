package com.StockAccounting.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

	@FindBy(id="btnreset")
	WebElement reset;
	@FindBy(id="username")
	WebElement UN;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="btnsubmit")
	WebElement login;
	public void adminLogin(String uid ,String pwd)
	{
		reset.click();
		UN.sendKeys(uid);
		password.sendKeys(pwd);
		login.click();
		
		
	}
}
