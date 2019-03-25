package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgram;

import com.bridgelabz.util.Functionalprogram;

public class InsertionSort {
	
		public static void main(String[] args) {
			System.out.println("Enter size: ");
			int n =Functionalprogram.getInputInteger();
			List<String>  words= new ArrayList<>();
			System.out.println("Enter the words:");

			for(int i=0;i<=n;i++){
				words.add(Functionalprogram.getInputString());
			}
			AlgorithmProgram.insertString(words,n);
			
		}

	}


	
			

	



