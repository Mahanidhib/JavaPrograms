package com.bridgelabz.functional_programs;
//import java.util.Scanner;

import com.bridgelabz.util.Functionalprogram;

public class LeapYear {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int year=Functionalprogram.getInputInteger();
		if(year>999)
		{ 
			Functionalprogram.leap(year);
		}
		else
		   {
			System.out.println("enter the four digit number");
		
		   }
	}
		
}

	

	
