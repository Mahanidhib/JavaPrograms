package com.bridgelabz.algorithm;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.Functionalprogram;



	public class BinarySearchWord {

		@SuppressWarnings("resource")
		public static void main(String[] args) throws Exception {
			File file =new File("C:\\Users\\Mahanidhi\\Desktop");
			BufferedReader bufferreader=new BufferedReader(new FileReader(file));
			String[] string =new String[50];
			String delimitor=" ";
			String st;
			while((st=bufferreader.readLine())!=null)
			{
				string=st.split(delimitor);
			}
			System.out.print("Array elements are: ");
		    for(String array:string)
		    {
		    	if(array!=null)
		    		System.out.print(array + "  ");
		    }
		    System.out.println("  ");
		    System.out.print("Sorted array:");
		    AlgorithmProgram. BubbleSort( string);
		    System.out.println("Enter the key element:");
		    String key=Functionalprogram.getInputString();
		    AlgorithmProgram.BinarySearch(string, key);

		}

	}

