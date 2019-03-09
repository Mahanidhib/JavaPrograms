package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class WindChill {

	public static void main(String[] args) {
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		System.out.println("enter the temperature in fahrenheit "+t);
	
		System.out.println("Enter the wind speed in MPH "+v);
	
	System.out.println("wind chill= "+Functionalprogram.wind(t,v));

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



