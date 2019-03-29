package com.bridgelabz.algorithm;

import com.bridgelabz.util.Functionalprogram;

public class SortInsertion<T> {

	public static void main(String[] args) {
		System.out.println("enter the number of elements");
		int N = Functionalprogram.getInputInteger();
		String[] array = new String[N];
		System.out.println("enter next element");
		for (int i = 0; i < N; i++) {
			array[i] = Functionalprogram.getInputString();
		}
		int n = array.length;
		long start = System.nanoTime();
		insertion(array, n);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		long end = System.nanoTime();
		double result = Functionalprogram.watch(start, end);
		System.out.println("elapsed time :" + result);

	}

	private static <T extends Comparable<T>> T[] insertion(String[] array, int n) {

		String temp;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j].compareToIgnoreCase(array[j - 1]) < 0) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else
					break;
			}
		}

		return null;

	}

}
