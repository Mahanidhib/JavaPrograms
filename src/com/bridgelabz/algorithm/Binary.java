package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class Binary {
	public static void main(String[] args) {
		System.out.println("Enter a decimal number to convert it into binary");
		int[] binary = AlgorithmProgram.toBinary(Functionalprogram.getInputInteger());
		System.out.println("Binary is ");
		AlgorithmProgram.showArr(binary);
//		int n=Functionalprogram.getInputInteger();
//        decToBinary(n); 
    } 
//	public static void decToBinary(int n) 
//    { 
//        // array to store binary number 
//        int[] binaryNum = new int[1000]; 
//   
//        // counter for binary array 
//        int i = 0; 
//        while (n > 0)  
//        { 
//            // storing remainder in binary array 
//            binaryNum[i] = n % 2; 
//            n = n / 2; 
//            i++; 
//        } 
//   
//        // printing binary array in reverse order 
//        for (int j = i - 1; j >= 0; j--) 
//            System.out.print(binaryNum[j]); 
//    } 
}
