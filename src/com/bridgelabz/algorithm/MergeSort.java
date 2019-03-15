package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class MergeSort {
	
	    public static void main(String[] args) {

	    	System.out.println("Enter the no. of Strings: ");
	    	int s=Functionalprogram.intModel();
	    	String[] arr=new String[s];
	    	
	    		for(int i=0;i<s;i++)
	    		{
	    			arr[i]=Functionalprogram.stringModel();
	    	   }
                 AlgorithmProgram.mergeSort(arr);

	   
        for (String n : arr) {
	            System.out.println(n);
	        }
	    }

	  
	}

