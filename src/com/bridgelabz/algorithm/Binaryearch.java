package com.bridgelabz.algorithm;

//import java.util.Arrays;

import com.bridgelabz.util.Functionalprogram;

public class Binaryearch {

	public static <T extends Comparable<T>> T[] binary(T[] array, T key){
		
		int length=array.length;
		int first=0;
		int last=length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
		
			if(key.compareTo(array[middle])>0)
		     {
		       first=middle+1;
	          }
			
		else if(array[middle].equals(key))
		{
			System.out.println(key+"-found at location-"+middle);
			break;
		}
		else
		{
			
			last=middle-1;
		}
		}
	
		return array;
	}

	
	public static <T> void main(String[] args) {
		System.out.println("enter the number of elements");
		int n= Functionalprogram.getInputInteger();
		String[] array=new String[n];
		System.out.println("enter next element");
		for(int i=0; i<n; i++) {
			array[i]= Functionalprogram.getInputString();
		}
		System.out.println("enter the key you want to search");
		String key=Functionalprogram.getInputString();
		System.out.println(binary(array,key));
		}
	}

	