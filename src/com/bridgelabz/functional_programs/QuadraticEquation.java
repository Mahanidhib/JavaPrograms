package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Functionalprogram;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("a=");
		int a=Functionalprogram.intModel();
		System.out.println("b=" );
		int b=Functionalprogram.intModel();
		System.out.println("c=");
		int c=Functionalprogram.intModel();
		Functionalprogram.roots(a,b,c);

	}

}
