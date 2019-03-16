package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class VendingMachine {

	public static void main(String[] args) {
		int[] change= {1, 2, 5, 10, 50, 100, 500, 1000};
		System.out.println("enter money");
		int money=Functionalprogram.getInputInteger();
		AlgorithmProgram.machine(change, money);
	}

}
