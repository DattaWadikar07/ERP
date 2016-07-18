package com.Interview.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		WebElement cntlnk=driver.findElement(By.tagName("a"));
		//System.out.println(size(cntlnk));  
		

	}

	
}
