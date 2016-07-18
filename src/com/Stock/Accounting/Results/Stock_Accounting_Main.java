package com.Stock.Accounting.Results;

import java.io.IOException;

import com.Stock_Accounting.Master.StockAccounting;
import com.Stock_Accounting.PropertiesFile.StockAccounting_Properties;

public class Stock_Accounting_Main  {

	public static void main(String[] args) throws IOException {
		
		
		
		
		StockAccounting_Properties sa=new StockAccounting_Properties();
		//sa.launchApplication("http://webapp.qedgetech.com");
		
		sa.launchApplication();
		sa.AdminLogin("admin", "master");
		sa.SupplierCreation("Datta", "S.R Nagar", "Hyderabad", "India", "Chandu", "9954654898","datta7@gmail.com	", "8945896866", "Note for contact person");
		sa.Stock_Item();
		
		sa.Stock_Categories();
		sa.UnitofMeasurement();
		
		sa.Lagout();
		sa.CloseApp();
		
		
		
		
		
		
	}

}
