 package com.StockAccounting.TestNG_Programs;

import org.testng.annotations.Test;

import com.Stock_Accounting.Master.StockAccounting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Stock_Accounting_TestNG_Example 
{
	public static StockAccounting sa=new StockAccounting();
	
  
  @BeforeTest
  public void AdminLogin()
 {
	sa.AdminLogin("admin", "master") ;
	
	  
  }

  @AfterTest
  public void Logout() 
  {
	  sa.Lagout();
  }

  @BeforeSuite
  public void OpenApp()
  {
	  sa.launchApplication();
  }

  @AfterSuite
  public void afterSuite() 
  {
	  sa.CloseApp();
	  
  }

}
