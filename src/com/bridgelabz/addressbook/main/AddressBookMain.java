package com.bridgelabz.addressbook.main;

import com.bridgelabz.addressbook.DataImplementation.AdressBookDataImplementation;
import com.bridgelabz.addressbook.Model.AddressBookInterface;
import com.bridgelabz.util.Functionalprogram;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBookInterface impl = new AdressBookDataImplementation();
		{
			impl.fileRead();

			System.out.println("Enter the first name");
			String firstName = Functionalprogram.getInputString();
			System.out.println("enter the last name");
			String lastName = Functionalprogram.getInputString();
			System.out.println("enter the address");
			String address = Functionalprogram.getInputString();
			System.out.println("Enter the city");
			String city = Functionalprogram.getInputString();
			System.out.println("enter the state");
			String state = Functionalprogram.getInputString();
			System.out.println("enter the zipccode");
			Long zipCode = Functionalprogram.getInputLong();
			System.out.println("enter the phoneNumber");
			Long phoneNumber = Functionalprogram.getInputLong();
			System.out.println("1.Add Person\n 2.remove person\n 3.sort by Name\n 4. sort by zipcode");
			int input = Functionalprogram.getInputInteger();

			switch (input) {
			case 1:
				impl.add(firstName, lastName, address, city, state, zipCode, phoneNumber);
				break;
			case 2:
				impl.remove();
				break;
			case 3:
				impl.sortByLastName();
				break;
			case 4:
				impl.sortByZipCode();
				break;

			}

			impl.writeFile();
		}

	}
}