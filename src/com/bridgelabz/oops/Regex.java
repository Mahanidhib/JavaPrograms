package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.util.Functionalprogram;
import com.bridgelabz.util.Oops;

public class Regex {

	/*
	 * The main function is written to take input from the user and replace the
	 * template in the json file with the input given
	 */
	public static void main(String[] args) throws FileNotFoundException {
		FileReader f = new FileReader("C:\\Users\\Mahanidhi\\Desktop\\jsonFile.txt");
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		String word = "";
		try {
			while ((word = read.readLine()) != null) {
				line = word;
			}
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the first name");
		String firstName = Functionalprogram.getInputString();
		System.out.println("Please enter the last name");
		String lastName = Functionalprogram.getInputString();
		String fullName = firstName + " " + lastName;
		System.out.println("Please enter your 10 digit phone number");
		String phoneNum = Functionalprogram.getInputString();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = dateFormat.format(date);

		// Method 1- using non-static function of Regex class
		// of com.bridgelabz.oops package
		String message = Oops.replace(firstName, fullName, phoneNum, formattedDate, line);

		System.out.println(message);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
	}
}