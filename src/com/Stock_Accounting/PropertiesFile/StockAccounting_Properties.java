package com.Stock_Accounting.PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class StockAccounting_Properties {
	
	
	
	public static Properties pr;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static String url="http://webapp.qedgetech.com";
	public static String  
	Eval,Aval;
	
	
	
			
	
	//launch Application 
	
	public void  launchApplication() throws IOException
	{
		pr=new Properties();
		fis=new FileInputStream("D:\\All General Document download  from outlook\\Selenium_Project\\Stock_Accouting\\src\\com\\Stock_Accounting\\PropertiesFile\\Reposistory.properties");
		pr.load(fis);
		
		Eval ="Login";
		driver=new FirefoxDriver();
		driver.get(url);
		Sleeper.sleepTightInSeconds(5);
		driver.manage().window().maximize();
		Aval=driver.findElement(By.id(pr.getProperty("subbtn"))).getText();
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
	
	
	public void AdminLogin(String uid,String pwd)
	{
		Eval="Administrator";
		driver.findElement(By.id(pr.getProperty("reset"))).click();
		driver.findElement(By.id(pr.getProperty("uname"))).sendKeys(uid);
	    driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys(pwd);
		driver.findElement(By.id(pr.getProperty("subbtn"))).click();
Aval=driver.findElement(By.xpath(pr.getProperty("Aval"))).getText();
    	
    	if (Eval.equalsIgnoreCase(Aval)) 
        {
    		
    		System.out.println("Login Pass");
        	//return "pass";	
    	}
        else
        {
        	
        	System.out.println("Login Fail");
        	//return "fail";
        }
        
	}//close method 
	                                                                                                           
	
	public void SupplierCreation(String name,String add,String city,String cntry,String cntprs,
			String phonenum ,String email,String mobile_number,String notes)
	{
		Eval="Add succeeded";
	     //open the supplier tab 
		driver.findElement(By.linkText(pr.getProperty("supplierlink"))).click();
		
		//click on add button
		driver.findElement(By.cssSelector(pr.getProperty("addbtn"))).click();
		Sleeper.sleepTightInSeconds(4);
		
		
		//details info about supplier 
    //driver.findElement(By.className("form-control"));
    
	driver.findElement(By.name(pr.getProperty("name"))).sendKeys(name);
	driver.findElement(By.id(pr.getProperty("address"))).sendKeys(add);
	driver.findElement(By.id(pr.getProperty("city"))).sendKeys(city);
	driver.findElement(By.id(pr.getProperty("country"))).sendKeys(cntry);
	driver.findElement(By.id(pr.getProperty("conperson"))).sendKeys(cntprs);
	driver.findElement(By.id(pr.getProperty("phone"))).sendKeys(phonenum);
	driver.findElement(By.name(pr.getProperty("email"))).sendKeys(email);
	driver.findElement(By.cssSelector(pr.getProperty("mobile"))).sendKeys(mobile_number);
	driver.findElement(By.id(pr.getProperty("notes"))).sendKeys(notes);
	driver.findElement(By.id(pr.getProperty("add"))).click();
	Sleeper.sleepTightInSeconds(3);
	
	driver.findElement(By.xpath(pr.getProperty("addcon"))).click();
	//driver.findElement(By.cssSelector(".ajs-button.btn.btn-primary")).click();
	
	Aval=driver.findElement(By.xpath(pr.getProperty("saval"))).getText();
	
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
		
		driver.findElement(By.xpath(pr.getProperty("stockitem"))).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath(pr.getProperty("addbtn"))).click();
		
		Sleeper.sleepTightInSeconds(2);
		//drop down operation1
		
		WebElement car=driver.findElement(By.id(pr.getProperty("category")));
		
		
		Select carlist=new Select(car);
		//java.util.List<WebElement> clist=carlist.getOptions();
		Sleeper.sleepTightInSeconds(2);
		
		carlist.selectByVisibleText("Samsung Laptop");
		Sleeper.sleepTightInSeconds(2);
		//drop down operation2
		WebElement car1=driver.findElement(By.id(pr.getProperty("supplier")));
		Select carlist1=new Select(car1);
		Sleeper.sleepTightInSeconds(2);
		carlist1.selectByVisibleText("Chandu");
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.id(pr.getProperty("stockname"))).sendKeys("Laptop");
		
		WebElement car2=driver.findElement(By.xpath(pr.getProperty("um")));
		Select carlist2=new Select(car2);
		Sleeper.sleepTightInSeconds(2);
		carlist2.selectByVisibleText("12 items");
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.xpath(pr.getProperty("purchase"))).sendKeys("12000");
		driver.findElement(By.xpath(pr.getProperty("selling"))).sendKeys("20000");
		driver.findElement(By.xpath(pr.getProperty("snotes"))).sendKeys("selling is completed status");
		driver.findElement(By.xpath(pr.getProperty("addbtn"))).click();
		Sleeper.sleepTightInSeconds(3);
		
		
		driver.findElement(By.xpath(pr.getProperty("addcon"))).click();
		
		Sleeper.sleepTightInSeconds(3);
		//driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).click();
		//Sleeper.sleepTightInSeconds(1);
		
		
		Aval=driver.findElement(By.xpath(pr.getProperty("aval"))).getText();
		
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
	
	
	public void Stock_Categories()
	{
		
		Eval="Add succeeded";
		
		Actions at=new Actions(driver);
		at.moveToElement(driver.findElement(By.xpath(pr.getProperty("movetostockcategory")))).build().perform();
		driver.findElement(By.xpath(pr.getProperty("stockcategory"))).click();
		Sleeper.sleepTightInSeconds(3);
		
		
		//click on the add button 
		driver.findElement(By.xpath(pr.getProperty("addbtn"))).click();
		Sleeper.sleepTightInSeconds(3);

		driver.findElement(By.xpath(pr.getProperty("categoryname"))).sendKeys("Samsung Laptop");
	    
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.id(pr.getProperty("add"))).click();
	    
	   driver.findElement(By.xpath(pr.getProperty("addcon"))).click();
	   Sleeper.sleepTightInSeconds(2);
	   
	   //driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	   Aval=driver.findElement(By.xpath(pr.getProperty("aval"))).getText();
		
		if (Eval.equalsIgnoreCase(Aval)) 
	    {
			
			System.out.println("Stock_Category_Creation Pass");
	    	//return "pass";	
		}
	    else
	    {
	    	
	    	System.out.println("Stock_Category_Creation  Fail");
	    	//return "fail";
	    }	
	}
	
	
	public void UnitofMeasurement()
	{
		
	     	Eval="Add succeeded";
		
		    Actions at1=new Actions(driver);
			at1.moveToElement(driver.findElement(By.xpath(pr.getProperty("mavetoum")))).build().perform();
			driver.findElement(By.xpath(pr.getProperty("clkum"))).click();
			Sleeper.sleepTightInSeconds(3);
			
			
			driver.findElement(By.xpath(pr.getProperty("addum"))).click();
			
			
			Sleeper.sleepTightInSeconds(4);
			
			driver.findElement(By.id(pr.getProperty("umid"))).sendKeys("U0023");
			driver.findElement(By.id(pr.getProperty("umdes"))).sendKeys("23 Items");
			 
			Sleeper.sleepTightInSeconds(2);
			
			//click on Add Button 
			driver.findElement(By.xpath(pr.getProperty("add"))).click();
			Sleeper.sleepTight(5);
			
			driver.findElement(By.xpath(pr.getProperty("addcon'"))).click();
		    Aval=driver.findElement(By.xpath(pr.getProperty("aval"))).getText();
				
				if (Eval.equalsIgnoreCase(Aval)) 
			    {
					
					System.out.println("Unit_of_Measurement_Creation Pass");
			    	//return "pass";	
				}
			    else
			    {
			    	
			    	System.out.println("Unit_Of_Measurement_Creation  Fail");
			    	//return "fail";
			    }	
	}//close Method
	
	
	
	
	
	
	public void Lagout()
	{
		 
		WebElement logout=driver.findElement(By.xpath(pr.getProperty("logout")));
		
		logout.click();
		System.out.println("Logout Application Pass");
	}
	
	
	public void CloseApp()
	{
		driver.close();
	}

	
	
}
