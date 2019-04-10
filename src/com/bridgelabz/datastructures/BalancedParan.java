package com.bridgelabz.datastructures;

import com.bridgelabz.util.DataStructuresProgram;
import com.bridgelabz.util.Functionalprogram;
import com.bridgelabz.util.StackLinkedList;

public class BalancedParan {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		StackLinkedList st = new StackLinkedList();
		System.out.println("Enter expression: ");
		String input = Functionalprogram.getInputString();
		char[] ch = input.toCharArray();

		if (DataStructuresProgram.areParenthesisBalanced(ch))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

}