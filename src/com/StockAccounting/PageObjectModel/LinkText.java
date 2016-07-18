package com.StockAccounting.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkText
{
@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
WebElement stockitem;
@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
WebElement supplier;
@FindBy(css="#mi_a_purchases>a")
WebElement purchases;
@FindBy(linkText="Customers")
WebElement customer;
@FindBy(linkText="Sales")
WebElement sales;
@FindBy(xpath=".//*[@id='logout']")
WebElement logout;

public void StockItem()
{
	stockitem.click();
}
public void Supplier()
{
	supplier.click();
	
}
public void Purchases()
{
	purchases.click();
	
}
public void Customer()
{
	customer.click();
}
public void sales()
{
	sales.click();
}
public void logout()
{
	logout.click();
}
	
	
}
