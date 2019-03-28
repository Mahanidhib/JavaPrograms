package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.util.Arrays;
//import java.util.Iterator;

import com.bridgelabz.util.Functionalprogram;
import com.bridgelabz.util.LinkedList;

public class UnorderedList {

		@SuppressWarnings({ "resource", "null" })
		public static void main(String[] args) throws Exception {
			LinkedList<String> list =new LinkedList<String>();
			File file = new File("C:\\Users\\Mahanidhi\\Desktop");
			BufferedReader bufferreader = new BufferedReader(new FileReader(file));
			String[] array = new String[50];
			String delimitor = " ";
			String st;
			while ((st = bufferreader.readLine())!=null);
			{
				array = st.split(delimitor);
		     }

			for (String k : array) {
			list.addElement(k);
		
			}
	       
			System.out.println("Enter the key value: ");
			String key = Functionalprogram.getInputString();
			boolean result=list.searchKey(key);
			if(result==true)
				list.addElement(key);
			else
				list.remove(key);
			 
			  
			 }
	}

	