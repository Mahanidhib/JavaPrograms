package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class Gambler {
	public static void main(String[] args) {
		
		System.out.println("enter the stake");  //Reading input number from the user
       int stake=Functionalprogram.intModel(); 
       System.out.println("enter the goal"); 
       int goal=Functionalprogram.intModel(); 
       System.out.println("enter the trails"); 
       int trial=Functionalprogram.intModel();  
     
       Functionalprogram.gambler(stake,goal,trial); }
}

	
