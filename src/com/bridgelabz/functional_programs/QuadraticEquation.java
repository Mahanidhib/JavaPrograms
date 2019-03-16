package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("a=");
		int a=Functionalprogram.getInputInteger();
		System.out.println("b=" );
		int b=Functionalprogram.getInputInteger();
		System.out.println("c=");
		int c=Functionalprogram.getInputInteger();
		Functionalprogram.roots(a,b,c);

	}

}
