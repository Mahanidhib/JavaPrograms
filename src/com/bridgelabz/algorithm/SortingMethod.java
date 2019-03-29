package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class SortingMethod {

	public static <T> void main(String[] args) {
		System.out.println("Enter your choice");
		int choice = Functionalprogram.getInputInteger();
		System.out.print("Enter the array size:");
		int n = Functionalprogram.getInputInteger();
		System.out.println("Enter array elements: ");
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Functionalprogram.getInputString();
		}

		switch (choice) {
		case 1:
			System.out.println("Perform binary search");
			System.out.println("Sorted array:");
			AlgorithmProgram.BubbleSort(arr);
			System.out.println("Enter the key:");
			String key = Functionalprogram.getInputString();
			long starttime = System.nanoTime();
			AlgorithmProgram.BinarySearch(arr, key);
			long endTime = System.nanoTime();
			long elapsed_time = Functionalprogram.watch(starttime, endTime);
			System.out.println("The time taken to perform binary search operation is " + elapsed_time + " ns");
			break;
		case 2:
			System.out.println("Perform bubble sort");
			System.out.println("Sorted array is:");
			long starttime1 = System.nanoTime();
			AlgorithmProgram.BubbleSort(arr);
			long endTime1 = System.nanoTime();
			long elapsed_time1 = Functionalprogram.watch(starttime1, endTime1);
			System.out.println("The time taken to perform bubble sorts operation is " + elapsed_time1 + " ns");
			break;

		case 3:
			System.out.println("Perform insertion sort");
			System.out.println("Sorted array:");
			long starttime11 = System.nanoTime();
			AlgorithmProgram.insertionSort(arr);
			long endTime11 = System.nanoTime();
			long elapsed_time11 = Functionalprogram.watch(starttime11, endTime11);
			System.out.println("The time taken to perform Insertion sort operation is " + elapsed_time11 + " ns");
			break;

		default:
			break;
		}

	}

}
