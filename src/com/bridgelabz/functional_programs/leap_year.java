package com.bridgelabz.functional_programs;
//import java.util.Scanner;

import com.bridgelabz.util.Functionalprogram;

public class leap_year {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int year=Functionalprogram.intModel();
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

	

	
