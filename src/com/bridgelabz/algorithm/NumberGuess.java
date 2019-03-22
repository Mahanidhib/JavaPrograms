package com.bridgelabz.algorithm;

import com.bridgelabz.util.Functionalprogram;

public class NumberGuess {

	public static void main(String[] args) {
		
		System.out.println("guess a no between 0 to 127 ");
		Functionalprogram.getInputInteger();
	try {
			System.out.println("guessed no is " + find());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}


	}
	

	static int find() {

		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
		int c=Functionalprogram.getInputInteger();
			
			if (c == 1) {
		
			
				high = mid;
			}
			else
				low = mid + 1;
		}
		return low;
	}
}
