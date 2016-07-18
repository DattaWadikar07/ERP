package com.StockAccounting.TestNG_Programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Stock_Accounting_Test_Cases extends Stock_Accounting_TestNG_Example
{
@Test(dataProvider="udata")
	public void UOM(String uid,String udesc)
	{
		sa.UnitofMeasurement(uid, udesc);
		
	}
	
	
	@Test
	public void StockAccounting( )
	{
		sa.Stock_Categories("Samsung mobiles");
		
	}
	@DataProvider
	public Object [][] udata()
	{
		Object[][] Obj=new Object[3][2];
		Obj[0][0]="admin";
		Obj[0][1]="master";
				

		Obj[1][0]="admin";
		Obj[1][1]="master";
		

		Obj[2][0]="Admin";
		Obj[2][1]="master";
				return Obj;
		
	}
	
	

}
