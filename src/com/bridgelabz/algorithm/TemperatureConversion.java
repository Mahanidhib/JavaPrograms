package com.bridgelabz.algorithm;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in Faharenheit ");
		float temperature=Functionalprogram.floatModel();
		float f=AlgorithmProgram.celsius(temperature);
		System.out.println("temperature in celsius is :"+f);
		
		System.out.println("Enter the temperature in celsius");
		float temperature1=Functionalprogram.floatModel();
		float c=AlgorithmProgram.faharenheit(temperature1);
		System.out.println("temperature in fahrenheit is"+c);
	
	}
	

}
