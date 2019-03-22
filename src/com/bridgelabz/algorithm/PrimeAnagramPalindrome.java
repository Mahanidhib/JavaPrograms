package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class PrimeAnagramPalindrome {


	public static void main(String[] args){
		System.out.println("Enter the lower limit :");
		int n = Functionalprogram.getInputInteger();
		System.out.println("Enter the upper limit :");
		int m = Functionalprogram.getInputInteger();
		AlgorithmProgram.prime(n, m);
		System.out.println();
	
		AlgorithmProgram.primePallindrome();
		System.out.println("prime and anagrams");
		AlgorithmProgram.primeAnagrams();

	}

		
	
	
}