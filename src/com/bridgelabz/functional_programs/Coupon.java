package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

//import java.util.Scanner;

public class Coupon {

		public static void main(String[] args) {
			System.out.println("enter the n distinct coupen");
			int n = Functionalprogram.getInputInteger();

			int count = Functionalprogram.coupon(n);
			System.out.println(count);
		}
				
		

	}


