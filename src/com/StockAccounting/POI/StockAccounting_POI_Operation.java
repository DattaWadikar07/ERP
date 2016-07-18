package com.StockAccounting.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Stock_Accounting.Master.StockAccounting;

public class StockAccounting_POI_Operation 
{
	public static int rc=0;
	public static FileInputStream fis;
	public static  XSSFWorkbook  wb;
	public static   XSSFSheet ws;
	public static FileOutputStream fos;
	
	public static void main(String[] args) throws IOException,FileNotFoundException
	{

		   
		StockAccounting_POI_Oper sap=new StockAccounting_POI_Oper();
		sap.launchApplication();
	
		
		//Admin login  code 
		
		try {
			//test data path 
			 fis=new FileInputStream("D:\\All General Document download  from outlook\\Selenium_Project\\Stock_Accounting\\src\\src\\com\\StockAccounting\\Testdata\\Stock_Accounting_Operation.xlsx");        
			
			//create work book sheet 
	         wb=new XSSFWorkbook(fis);
	        ws=wb.getSheet("Sheet1");
	       
	        rc=ws.getLastRowNum();
	      System.out.println("No. of rows "+rc);
	      
	      for (int i = 1; i <=rc; i++) 
	      {
			
		 XSSFRow wr=ws.getRow(i);
		 XSSFCell  wc1=wr.getCell(0);
		 XSSFCell wc2=wr.getCell(1);
		 XSSFCell wc3=wr.createCell(2);
		 
		 String uid=wc1.getStringCellValue();
		 String pwd=wc2.getStringCellValue();
		 
		String res=sap.AdminLogin(uid, pwd);
		 
		 wc3.setCellValue(res);
	 }//for
	       fos=new FileOutputStream("D:\\All General Document download  from outlook\\Selenium_Project\\Stock_Accounting\\src\\src\\com\\StockAccounting\\Results");
	  } 
		
		catch (Exception e)
		{
				System.out.println(e);
			
}//end of admin login code
		
		
		//supplier creation code  
		
		try {
			
			 fis=new FileInputStream("D:\\All General Document download  from outlook\\Selenium_Project\\Stock_Accounting\\src\\src\\com\\StockAccounting\\Testdata\\Stock_Accounting_Operation.xlsx");        
				
				//create work book sheet 
		         wb=new XSSFWorkbook(fis);
		        ws=wb.getSheet("Sheet2");
		       
		        rc=ws.getLastRowNum();
		         
		      for (int i = 1; i <=rc; i++) 
		      {
				
			 XSSFRow wr=ws.getRow(i);
			 XSSFCell  wc1=wr.getCell(0);
			 XSSFCell wc2=wr.getCell(1);
			 XSSFCell wc3=wr.getCell(2);
			XSSFCell wc4=wr.getCell(3);		
			XSSFCell wc5=wr.getCell(4);
			 XSSFCell wc6=wr.getCell(5);
			XSSFCell wc7=wr.getCell(6);
			XSSFCell wc8=wr.getCell(7);
			XSSFCell wc9=wr.getCell(8);
			
			
			 
			 
			 
			
	         String Name=wc1.getStringCellValue();
			 String Address=wc2.getStringCellValue();
			 String City =wc3.getStringCellValue();
			 String Country=wc4.getStringCellValue();
			 String ContactPerson=wc5.getStringCellValue();
			 String phonenumber=wc6.getStringCellValue();
			 String Email=wc7.getStringCellValue();
			 String Mobilenumber=wc8.getStringCellValue();
			 String Notes=wc9.getStringCellValue();
			 
		     sap.SupplierCreation(Name, Address, City, Country, ContactPerson, phonenumber, Email, Mobilenumber, Notes);
			 
			 }//for
	
		       fos=new FileOutputStream("D:\\All General Document download  from outlook\\Selenium_Project\\Stock_Accounting\\src\\src\\com\\StockAccounting\\Results");

		      
		      
		}//try
		
		      catch (Exception e)
		    {
		    	  System.out.println(e);
		    	  
			} //end of supplier creation code 
	
		
		
finally 
		{
		       wb.write(fos);
		        wb.close();  
		}

	}//main method 
	

}//class
