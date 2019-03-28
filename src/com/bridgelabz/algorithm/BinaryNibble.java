package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class BinaryNibble {
	public static void main(String[] args) {
		try {
			System.out.println("Enter a NUM");
			int[] binary = AlgorithmProgram.toBinary(Functionalprogram.getInputInteger());
			System.out.println("Binary is ");
			AlgorithmProgram.showArr(binary);
			AlgorithmProgram.swapNibbles(binary);
			System.out.println("After swapping ");
			AlgorithmProgram.showArr(binary);
			int swapDec = AlgorithmProgram.toDecimal(binary);
			System.out.println("Decimal of swapped binary is " + swapDec);

		} catch (Exception e) {
			System.out.println("Enter input as integer ");
		}
	}
}



       
