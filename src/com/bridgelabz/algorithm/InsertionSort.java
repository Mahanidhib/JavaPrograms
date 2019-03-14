package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class InsertionSort {
	

		public static void main(String[] args) {
			long startTime = System.nanoTime();
			System.out.println("Enter array size:");
			int n=Functionalprogram.intModel();
			int[] array=new int[n];
			System.out.println("Enter array elements:");
			for(int i=0;i<n;i++)
			{
				array[i]=Functionalprogram.intModel();
			}
			System.out.println("Sorted array:");
			AlgorithmProgram.insertint(array);
			long endTime = System.nanoTime();
			long time=Functionalprogram.watch(startTime, endTime); 
			System.out.println("Execution time in nanoeconds:" + time +" ns");	

		}

	}



