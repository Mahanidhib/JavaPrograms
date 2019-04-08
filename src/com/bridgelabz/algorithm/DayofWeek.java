package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
//import com.bridgelabz.util.Functionalprogram;

public class DayofWeek {

	public static void main(String[] args) {
		
		int year=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int date=Integer.parseInt(args[2]);
		
		
	int res=	AlgorithmProgram.week(year, month, date);
	System.out.print("The day is  "+res);
	}
	
		
	}