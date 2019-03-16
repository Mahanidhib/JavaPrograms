package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class Array2D {

	public static void main(String[] args) {
		System.out.println("rows");
		int rows = Functionalprogram.getInputInteger();
		System.out.println("columns");
		int columns = Functionalprogram.getInputInteger();
		Object arr[][] = new Object[rows][columns];
		/*	
		*/
		Functionalprogram.array2D(rows, columns, arr);
	}
}
