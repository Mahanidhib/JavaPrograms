package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println("enter a first string");
		String firstString=Functionalprogram.stringModel();
		
        char[] s=firstString.toCharArray();
        System.out.println("Enter the second string");
        String secondString=Functionalprogram.stringModel();
     
        char[] r=secondString.toCharArray();
        
        
        if(AlgorithmProgram.areAnagram(s,r))
        		System.out.println("The two strings are anagrams to each other");
        else
        	System.out.println("The two strings are not anagrams to each other");
	}

}
