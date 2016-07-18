package com.StockAccounting.PageObjectModel;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class POM_Test  
{
   public static WebDriver driver;

   
	public void PageObjectModel_Execution()
{
	driver=new FirefoxDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	lp.adminLogin("admin", "master");
	
	
	/*LinkText  links=PageFactory.initElements(driver, LinkText.class);
	
	links.StockItem();
	driver.navigate().back();
	links.Supplier();
	driver.navigate().back();
	links.Purchases();
	driver.navigate().back();
	links.Customer();
	driver.navigate().back();
	links.sales();
	driver.navigate().back();
	links.logout();
	List<WebElement> okb=driver.findElements(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
    for (int i = 0; i < okb.size(); i++) 
    {
    	if (okb.get(i).getText().equalsIgnoreCase("OK!"))
    	{
    		okb.get(i).click();
    		break;
  		}
  		
  	}*/
	
              Supplier_Page sp=PageFactory.initElements(driver, Supplier_Page.class);
    
              sp.supplier();
              sp.add();
              sp.Supplier_Creation("Datta", "pune", "pune", "india", "chandu", "9987656765", "wadikardatta123@gmail.com","9854698564", "samsung laptops");
              sp.addbutton1();
              sp.addlalert();
             
              
              Stock_Item si=PageFactory.initElements(driver, Stock_Item.class);
              si.StockItem();
              si.addbutton();
              si.Stock_Item_Creation("uploaded goods", "1002", "10000", "20000", "item collect from chandu");
              si.addbuttonSi();
           
driver.quit();

	
}
   

	
	

	
	

}
