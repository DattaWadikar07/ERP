package com.Stock_Accounting_Login;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;


public class Stock_Accounting_Login {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com/");
		Sleeper.sleepTightInSeconds(5);
		driver.manage().window().maximize();
		
		//login operation
		
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		
		
		//open the supplier tab 
		
		driver.findElement(By.linkText("Suppliers")).click();
		
		//click on add button
		
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		Sleeper.sleepTightInSeconds(4);
		
		
		//details info about supplier 
    //driver.findElement(By.className("form-control"));
    
	driver.findElement(By.name("x_Supplier_Name")).sendKeys("Chandu");
	driver.findElement(By.id("x_Address")).sendKeys("AT.S.R Nagar ,Hyderabad");
	driver.findElement(By.id("x_City")).sendKeys("hyderabad");
	driver.findElement(By.id("x_Country")).sendKeys("India");
	driver.findElement(By.id("x_Contact_Person")).sendKeys("Satish");
	driver.findElement(By.id("x_Phone_Number")).sendKeys("8768866868");
	driver.findElement(By.name("x__Email")).sendKeys("chandu123@gmail.com");
	driver.findElement(By.cssSelector("#x_Mobile_Number")).sendKeys("8977567654");
	driver.findElement(By.id("x_Notes")).sendKeys("MR.chandu is new supplier in our organization ");
	driver.findElement(By.id("btnAction")).click();
	
	
	
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.cssSelector(".ajs-button.btn.btn-primary")).click();
	
	
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
	driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).click();
	Sleeper.sleepTightInSeconds(1);
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/ul[1]/li[2]/a")).click();
	//click on the stock category
	Actions at=new Actions(driver);
	at.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/ul[1]/li[2]/a"))).build().perform();
	driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
	Sleeper.sleepTightInSeconds(3);
	
	
	//click on the add button 
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	Sleeper.sleepTightInSeconds(3);

	driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys("Samsung Laptop");
    
    Sleeper.sleepTightInSeconds(2);
    driver.findElement(By.id("btnAction")).click();
    
   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
   
   Sleeper.sleepTightInSeconds(2);
   
   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	
	
	
	//click on unit and measurement
   Actions at1=new Actions(driver);
	at1.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/ul[1]/li[2]/a"))).build().perform();
	driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
	Sleeper.sleepTightInSeconds(3);
	
	
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	
	
	Sleeper.sleepTightInSeconds(4);
	
	driver.findElement(By.id("x_UOM_ID")).sendKeys("U0023");
	driver.findElement(By.id("x_UOM_Description")).sendKeys("23 Items");
	 
	Sleeper.sleepTightInSeconds(2);
	
	//click on Add Button 
	driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	Sleeper.sleepTight(5);
	
	driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
	
	driver.close();
		
		
		
		

	}

}
