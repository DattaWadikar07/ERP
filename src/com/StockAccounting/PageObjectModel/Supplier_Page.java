package com.StockAccounting.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Supplier_Page {
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
     public WebElement add;
	
	@FindBy(id="x_Supplier_Name")
	public WebElement sname;
	@FindBy(xpath=".//*[@id='x_Address']")
	public  WebElement address;
	@FindBy(xpath=".//*[@id='x_City']")
	public WebElement city;
	@FindBy(xpath=".//*[@id='x_Country']")
     public WebElement country;
	@FindBy(xpath=".//*[@id='x_Contact_Person']")
	public WebElement contactperson;
	@FindBy(xpath=".//*[@id='x_Phone_Number']")
	public WebElement phone;
	@FindBy(xpath=".//*[@id='x__Email']")
	public WebElement email;
	@FindBy(xpath=".//*[@id='x_Mobile_Number']")
	public WebElement mobile;
	@FindBy(xpath=".//*[@id='x_Notes']")
	public WebElement notes;
	
	@FindBy(xpath=".//*[@id='btnAction']")
	public WebElement addbutton;
	
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement supplier;
	@FindBy(xpath=".//*[@id='logout']")
	WebElement logout;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
   WebElement addalert;
	public void addlalert()
	{
		addalert.click();
	}
	
	public void add()
	{
		add.click();
	}
	public void addbutton1()
	{
		addbutton.click();
	}
	
	public void supplier()
	{
		supplier.click();
	}
	public void logout()
	{
		logout.click();
	}
	
	public void Supplier_Creation(String name,String add,String city,String country,String contactPerson,String phone,String email, String mobile,String notes  )
	{
		
	
     this.sname.sendKeys(name);
     this.address.sendKeys(add);
     this.city.sendKeys(city);
     this.country.sendKeys(country);
     this.contactperson.sendKeys(contactPerson);
     this.phone.sendKeys(phone);
     this.email.sendKeys(email);
     this.mobile.sendKeys(mobile);
     this.notes.sendKeys(notes);
     
     
 }
	
}
