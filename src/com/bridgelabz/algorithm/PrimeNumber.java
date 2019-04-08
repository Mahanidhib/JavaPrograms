package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgram;
//import com.bridgelabz.util.Functionalprogram;
import com.bridgelabz.util.Functionalprogram;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the lower limit :");
		int n = Functionalprogram.getInputInteger();
		System.out.println("Enter the upper limit :");
		int m = Functionalprogram.getInputInteger();
		List<Integer>list=new ArrayList<Integer>();
		
		list=AlgorithmProgram.isPrime(n, m);
		// System.out.println (n,m);
		for (int kl : list)
			System.out.print(kl + " ");
	}
	
	
}
