package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class Gambler {
	public static void main(String[] args) {
		
		System.out.println("enter the stake");  //Reading input number from the user
       int stake=Functionalprogram.getInputInteger(); 
       System.out.println("enter the goal"); 
       int goal=Functionalprogram.getInputInteger(); 
       System.out.println("enter the trails"); 
       int trial=Functionalprogram.getInputInteger();  
     
       Functionalprogram.gambler(stake,goal,trial); }
}

	
