package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class SumThree {
	public static void main(String[] args) 
	{ 
		
		 System.out.println("enter the value");
		    int n =Functionalprogram.intModel();
	    int arr[] =new int[n];
	   
	  
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("values");
	    	arr[i]=Functionalprogram.intModel();
	    }
	    Functionalprogram.findTriplets(n, arr);
	  
	} 

}
