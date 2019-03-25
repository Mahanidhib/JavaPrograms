package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;



public class BubbleSort {



	public static void main(String[] args)
	{
		System.out.println("Enter size: ");
		int n =Functionalprogram.getInputInteger();
		List<Integer> nos = new ArrayList<>();
		System.out.println("Enter elements:");

		for(int i=0;i<n;i++){
			nos.add(Functionalprogram.getInputInteger());
		}
		AlgorithmProgram.bubble(nos, n); 
	}
}
