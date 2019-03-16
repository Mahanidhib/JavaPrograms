package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class Anagram {

	public static void main(String[] args) {

		System.out.println("enter a first string");
		String firstString = Functionalprogram.getInputString();

		char[] string1 = firstString.toCharArray();
		System.out.println("Enter the second string");
		String secondString = Functionalprogram.getInputString();

		char[] string2 = secondString.toCharArray();

		if (AlgorithmProgram.anagram(string1, string2))
			System.out.println("The two strings are anagrams to each other");
		else
			System.out.println("The two strings are not anagrams to each other");
	}

}
