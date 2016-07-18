package com.Stock_Accounting.General_Java_Programs;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class RevesrProgram {

	public static void main(String[] args) {
		
    //Variable Declaration 
		String name="Srinu";
		 String reverse = " ";
		 
		int count=name.length();
		
		//for loop 
		
		  for ( int i = count - 1 ; i >= 0 ; i-- )
		  {
			  System.out.print(name.charAt(i));
			  //reverse = reverse + name.charAt(i);
		  }		
		  //print Statement 
		//  System.out.println("Reverse of entered string is: "+reverse);
			
		 
		
	}
	
}

