package com.Stock_Accounting.Master;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class StockAccounting {
	
	
	
	public static WebDriver driver;
	public static String url="http://webapp.qedgetech.com";
	public static String  Eval,Aval;
	
	
	//launch Application 
	
	public void  launchApplication()
	{
		
		Eval ="Login";
		driver=new FirefoxDriver();
		driver.get(url);
		Sleeper.sleepTightInSeconds(5);
		driver.manage().window().maximize();
		Aval=driver.findElement(By.id("btnsubmit")).getText();
	    if (Eval.equalsIgnoreCase(Aval)) 
	    {
	    	System.out.println("Launch Application Pass");
	    	//return "pass";	
		}
	    else
	    {
	    	System.out.println("Launch Application Fail");
	    	
	    	//return "fail";
	    }
	
	
	}//close function 
	
	
	public String   AdminLogin(String uid,String pwd)
	{
		Eval="Administrator";
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys(uid);
	    driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("btnsubmit")).click();
Aval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
    	
    	if (Eval.equalsIgnoreCase(Aval)) 
        {
    		
    		//System.out.println("Login Pass");
        	return "pass";	
    	}
        else
        {
        	
        	//System.out.println("Login Fail");
        	return "fail";
        }
        
	}//close method 
	                                                                                                           
	
	public void SupplierCreation(String name,String add,String city,String cntry,String cntprs,
			String phonenum ,String email,String mobile_number,String notes)
	{
		Eval="Add succeeded";
	     //open the supplier tab 
		driver.findElement(By.linkText("Suppliers")).click();
		
		//click on add button
		driver.findElement(By.cssSelector(".btn.btn-default.ewAddEdit.ewAdd.btn-sm")).click();
		Sleeper.sleepTightInSeconds(4);
		
		
		//details info about supplier 
    //driver.findElement(By.className("form-control"));
    
	driver.findElement(By.name("x_Supplier_Name")).sendKeys(name);
	driver.findElement(By.id("x_Address")).sendKeys(add);
	driver.findElement(By.id("x_City")).sendKeys(city);
	driver.findElement(By.id("x_Country")).sendKeys(cntry);
	driver.findElement(By.id("x_Contact_Person")).sendKeys(cntprs);
	driver.findElement(By.id("x_Phone_Number")).sendKeys(phonenum);
	driver.findElement(By.name("x__Email")).sendKeys(email);
	driver.findElement(By.cssSelector("#x_Mobile_Number")).sendKeys(mobile_number);
	driver.findElement(By.id("x_Notes")).sendKeys(notes);
	driver.findElement(By.id("btnAction")).click();
	Sleeper.sleepTightInSeconds(3);
	
	driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
	//driver.findElement(By.cssSelector(".ajs-button.btn.btn-primary")).click();
	
	Aval=driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[3]/div/div")).getText();
	
	if (Eval.equalsIgnoreCase(Aval)) 
    {
		
		System.out.println("SupplierCreation Pass");
    	//return "pass";	
	}
    else
    {
    	
    	System.out.println("SupplierCreation  Fail");
    	//return "fail";
    }
    }//close Method
	
	
	
	public void Stock_Item()
	{
		
		Eval="Add succeeded";	
		
		
		//click on stock item 
		
		driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		
		Sleeper.sleepTightInSeconds(2);
		//drop down operation1
		
		WebElement car=driver.findElement(By.id("x_Category"));
		
		
		Select carlist=new Select(car);
		//java.util.List<WebElement> clist=carlist.getOptions();
		Sleeper.sleepTightInSeconds(2);
		
		carlist.selectByVisibleText("Samsung Laptop");
		Sleeper.sleepTightInSeconds(2);
		//drop down operation2
		WebElement car1=driver.findElement(By.id("x_Supplier_Number"));
		Select carlist1=new Select(car1);
		Sleeper.sleepTightInSeconds(2);
		carlist1.selectByVisibleText("Chandu");
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.id("x_Stock_Name")).sendKeys("Laptop");
		
		WebElement car2=driver.findElement(By.xpath(".//*[@id='x_Unit_Of_Measurement']"));
		Select carlist2=new Select(car2);
		Sleeper.sleepTightInSeconds(2);
		carlist2.selectByVisibleText("12 items");
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.xpath(".//*[@id='x_Purchasing_Price']")).sendKeys("12000");
		driver.findElement(By.xpath(".//*[@id='x_Selling_Price']")).sendKeys("20000");
		driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys("selling is completed status");
		driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
		Sleeper.sleepTightInSeconds(3);
		
		
		driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		
		Sleeper.sleepTightInSeconds(3);
		//driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).click();
		//Sleeper.sleepTightInSeconds(1);
		
		
		Aval=driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[3]/div/div")).getText();
		
		if (Eval.equalsIgnoreCase(Aval)) 
	    {
			
			System.out.println("Stock_Item_Creation Pass");
	    	//return "pass";	
		}
	    else
	    {
	    	
	    	System.out.println("Stock_Item_Creation  Fail");
	    	//return "fail";
		
	    }
		
		
	}
	
	
	public String Stock_Categories(String name)
	{
		
		Eval="Add succeeded";
		
		Actions at=new Actions(driver);
		at.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/ul[1]/li[2]/a"))).build().perform();
		driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		Sleeper.sleepTightInSeconds(3);
		
		
		//click on the add button 
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[*]/div[1]/div[1]/div[1]/div/a/span")).click();
		Sleeper.sleepTightInSeconds(3);

		driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys(name);
	    
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.id("btnAction")).click();
	    
	   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
	   Sleeper.sleepTightInSeconds(2);
	   
	   //driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	   Aval=driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).getText();
		
		if (Eval.equalsIgnoreCase(Aval)) 
	    {
			
			//System.out.println("Stock_Category_Creation Pass");
	    	return "pass";	
		}
	    else
	    {
	    	
	    	//System.out.println("Stock_Category_Creation  Fail");
	    	return "fail";
	    }	
	}
	
	
	public String UnitofMeasurement(String uid,String udesc)
	{
		
	     	Eval="Add succeeded";
		
		    Actions at1=new Actions(driver);
			at1.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/ul[1]/li[2]/a"))).build().perform();
			driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
			Sleeper.sleepTightInSeconds(3);
			
			
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			
			
			Sleeper.sleepTightInSeconds(4);
			
			driver.findElement(By.id("x_UOM_ID")).sendKeys(uid);
			driver.findElement(By.id("x_UOM_Description")).sendKeys(udesc);
			 
			Sleeper.sleepTightInSeconds(2);
			
			//click on Add Button 
			driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
			Sleeper.sleepTight(5);
			
			driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		    Aval=driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).getText();
				
				if (Eval.equalsIgnoreCase(Aval)) 
			    {
					
				//	System.out.println("Unit_of_Measurement_Creation Pass");
			    	return "pass";	
				}
			    else
			    {
			    	
			    	//System.out.println("Unit_Of_Measurement_Creation  Fail");
			    	return "fail";
			    }	
	}//close Method
	
	
	
	
	
	
	public void Lagout()
	{
		 
		WebElement logout=driver.findElement(By.xpath(".//*[@id='mi_logout']/a"));
		
		logout.click();
		System.out.println("Logout Application Pass");
	}
	
	
	public void CloseApp()
	{
		driver.close();
	}

	
	
}
