package com.StockAccounting.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Stock_Item 
{
	
	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
    public WebElement stockItem;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	public WebElement addbutton;
	
	@FindBy(xpath=".//*[@id='x_Category']")
	public WebElement category;
	
@FindBy(xpath=".//*[@id='x_Supplier_Number']")
public WebElement supplier_name;
@FindBy(xpath=".//*[@id='x_Stock_Name']")
public WebElement stock_name;
@FindBy(xpath=".//*[@id='x_Unit_Of_Measurement']")
public WebElement uom;
@FindBy(xpath=".//*[@id='x_Purchasing_Price']")
public WebElement purcchases;
@FindBy(xpath=".//*[@id='x_Selling_Price']")
public WebElement selling ;
@FindBy(xpath=".//*[@id='x_Notes']")
public WebElement notes;
@FindBy(xpath=".//*[@id='btnAction']")
public WebElement add;
@FindBy(xpath=".//*[@id='x_Supplier_Number']")
public WebElement supplier_Number;
@FindBy (xpath=".//*[@id='x_Stock_Name']")
public WebElement stocknm;
@FindBy(xpath=".//*[@id='x_Unit_Of_Measurement']")
public  WebElement uom1;
@FindBy(xpath=".//*[@id='x_Purchasing_Price']")
public WebElement purchases;
@FindBy(xpath=".//*[@id='x_Selling_Price']")
public WebElement Selling;
@FindBy(xpath=".//*[@id='x_Notes']")
public WebElement notes1;
@FindBy(xpath=".//*[@id='btnAction']")
public WebElement addbuttonstockItem;

public void StockItem()
{
	stockItem.click();
}
public void addbutton()
{
	addbutton.click();
}

public void Stock_Item_Creation(String stockname,String uom,String purchases,String sell ,String notes)
{
	Select cat=new Select(category);
	cat.selectByVisibleText("Samsung mobiles");
    	
	Select cat1=new Select(supplier_Number);
	cat1.selectByVisibleText("Chandu");
	
	stock_name.sendKeys(stockname);
	uom1.sendKeys(uom);
	purcchases.sendKeys(purchases);
	selling.sendKeys(sell);
	notes1.sendKeys(notes);
	
	
}

public void addbuttonSi()
{
	addbuttonstockItem.click();
}
}
