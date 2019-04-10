package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgram;

public class PrimeNumbers2D {
	public static void main(String[] args){
	List<List<Integer>> a1 =new ArrayList<List<Integer>>();
	int start=0;
	int end=100;
	for(int i=0;i<10;i++){
		List<Integer> listofPrimeNumbers = AlgorithmProgram.isPrime(start,end);
		
		a1.add(listofPrimeNumbers);
		start+=100;
		end+=100;
	}
	for(int i =0; i<a1.size(); i++){
		List<Integer>  primeNumbers = a1.get(i);
		for(int j=1; j<primeNumbers.size(); j++){
			System.out.print(primeNumbers.get(j)+" ");
		}
		System.out.println();
	}
}
}


