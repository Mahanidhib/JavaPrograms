package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

//import java.util.Arrays;

public class AlgorithmProgram {

	/**
	 * Input an Array;
	 * 
	 * @return
	 */
	public static int[] arr() {
		int n = Functionalprogram.getInputInteger();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Functionalprogram.getInputInteger();
		}

		return arr;
	}

	/**
	 * 1.Anagram
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean anagram(char[] string1, char[] string2) {
		int n1 = string1.length;
		int n2 = string2.length;

		if (n1 != n2)
			return false;

//		
//		Arrays.sort(str1);
//		Arrays.sort(str2);

		for (int i = 0; i < n1; i++)
			if (string1[i] != string2[i])
				return false;

		return true;

	}

	/**
	 * 2.Prime Number;
	 * 
	 * @param s1
	 * @param s2
	 */
	public static List<Integer> isPrime(int min, int max) {
		int i, count, k = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (min <= max) {
			count = 0;
			i = 2;
			// Divisors always lies between 0 to (number/2)
			while (i <= min / 2) {
				if (min % i == 0) {
					count++;

					break;
				}
				i++;
			}
			if (count == 0 && min != 1) {
				list.add(min);

			}
			min++;
		}

		return list;

	}

	/**
	 * Bubble sort
	 * 
	 * @param a
	 */
	public static void bubble(List<Integer> nos, int n) {
		int i, temp;

		for (i = 0; i < nos.size() - 1; i++) {
			for (int j = 0; j < nos.size() - i - 1; j++) {

				if (nos.get(j) > nos.get(j + 1)) {
					temp = nos.get(j);
					nos.set(j, nos.get(j + 1));
					nos.set(j + 1, temp);

				}
			}
		}
		for (int k : nos) {
			System.out.println(k + " ");
		}

	}

	/**
	 * Merge Sort Strings
	 * 
	 * @param names
	 */
	public static void mergeSort(String[] names) {
		if (names.length >= 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	/**
	 * Monthly Payment
	 * 
	 * @param p
	 * @param y
	 * @param r
	 * @return
	 */
	public static double monthPayment(double p, double y, double r) {
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}

	/**
	 * converting to fahrenheit
	 * 
	 * @param celsius
	 * @return
	 */
	public static float faharenheit(float celsius) {
		float fahrenheit = 9 * (celsius / 5) + 32;
		return fahrenheit;

	}

	/**
	 * Converting to celsius
	 * 
	 * @param fahrenheit
	 * @return
	 */
	public static float celsius(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	/**
	 * Vending Machine
	 * 
	 * @param change
	 * @param money
	 */
	public static void machine(int[] change, int money) {
		for (int i = change.length - 1; i >= 0; i--) {
			int count = 0;
			if (money == 0)
				return;
			else {
				if (money >= change[i]) {
					count = money / change[i];
					System.out.println(change[i] + " notes:" + count);
					money = money - (count * change[i]);
				}
			}

		}

	}

	/**
	 * Day of Week
	 * 
	 * @param year
	 * @param month
	 * @param date
	 */
	public static int week(int year, int month, int date) {

		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (date + x + 31 * m0 / 12) % 7;

		return d0;

	}

	// Function to convert decimal to binary//
	/**
	 * @param number
	 * @return
	 */
	public static int[] toBinary(int number) {
		String bin = "";
		while (number != 0) {
			bin = (number % 2) + bin;
			number /= 2;
		}

		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntArray(bin);

	}

	private static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;

	}

	public static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static int[] swapNibbles(int[] arr) {
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	// Function to convert binary to decimal//
	/**
	 * @param binary
	 * @return
	 */
	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;

	}

	public static void primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
		}
	}

	private static boolean isPallindrome(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;

	}

	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}

	}

	private static boolean anagram(Integer n1, Integer n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;

	}

	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	// INSERTION SORT LIST
	public static void insertString(List<String> array, int n) {

		int i = 0, j = 0, w;
		String temp;
		for (i = 0; i < array.size(); i++) {
			for (j = 0; j <= i; j++) {
				if (array.get(j).compareTo(array.get(i)) > 0) {
					temp = array.get(j);
					array.set(j, array.get(i));
					for (w = i; w > j + 1; w--) {
						array.set(w, array.get(w - 1));
					}
					array.set(w, temp);
				}
			}
		}

		for (String k : array)
			System.out.print(k + " ");
		System.out.println(" ");
	}

	/**
	 * Bubble sort for String
	 * 
	 * @param str
	 */
	public static void isBubbleString(String str) {
		char[] array = str.toCharArray();
		char temp;
		int i, n = array.length;
		for (i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// INSERTION SORT
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int i = 0, j = 0, w;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < i; j++) {
				if (array[j].compareTo(array[i]) > 0) {
					T temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--) {
						array[w] = array[w - 1];
					}
					array[w] = temp;
				}
			}
		}
		for (T kl : array)
			System.out.println(kl + " ");
		System.out.println(" ");
	}

	// bubble sort
	public static <T extends Comparable<T>> T[] BubbleSort(T[] array) {
		int i;
		int n = array.length;
		for (i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.println(array[i] + " ");
		}
		return array;
	}

	// BINARY SEARCH
	public static <T extends Comparable<T>> void BinarySearch(T[] arr, T key) {

		int low = 0, high = arr.length - 1, mid = 0;
		mid = (low + high) / 2;
		while (low <= high) {
			if (key.compareTo(arr[mid]) > 0)
				low = mid + 1;
			else if (arr[mid].equals(key)) {
				System.out.println("key element found at index " + mid);
				break;
			} else
				high = mid - 1;

			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("key element not found");
		}
	}

}
