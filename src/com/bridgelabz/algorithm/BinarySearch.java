package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.util.Functionalprogram;

public class BinarySearch {

	public static void main(String args[]) {
		System.out.println("Enter the no. of elements ");
		int noOfElements = Functionalprogram.getInputInteger();

		String[] elements = new String[noOfElements];
		System.out.println("Enter the Streings ");
		for (int i = 0; i < noOfElements; i++) {
			elements[i] = Functionalprogram.getInputString();

		}
		System.out.println("Enter the String you want to search ");
		String search = Functionalprogram.getInputString();

		Arrays.sort(elements);
		for (String element : elements) {
			System.out.println(element);
		}
		int x = binarySearch(elements, search);

		if (x == -1) {

			System.out.println("not found");
		} else
			System.out.println("found " + search + " in " + x);
	}

	public static int binarySearch(String[] s, String w) {
		int l = s.length - 1;
		int nl = 0;
		while (nl <= l) {
			int m = nl + l / 2;
			int mid = w.compareTo(s[m]);
			if (mid == 0)
				return m;
			if (mid > 0)
				nl = m + 1;
			else
				l = m - 1;
		}

		return -1;
	}
}
