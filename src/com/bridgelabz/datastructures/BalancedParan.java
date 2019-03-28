package com.bridgelabz.datastructures;

import com.bridgelabz.util.DataStructuresProgram;
import com.bridgelabz.util.Functionalprogram;
import com.bridgelabz.util.StackImplementation;

public class BalancedParan  
{ 
    @SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args)  
    { 
    	 StackImplementation st=new StackImplementation(); 
    	 System.out.println("Enter expression: ");
    	String input=Functionalprogram.getInputString();
     char[] ch= input.toCharArray();
     
     
          if (DataStructuresProgram.areParenthesisBalanced(ch)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced ");   
    } 
  
    
  
} 