package com.bridgelabz.addressbookServiceImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressbook.AddressBookData;
import com.bridgelabz.addressbookModel.AddressBookInterface;
import com.bridgelabz.util.Functionalprogram;
import com.google.gson.Gson;

public class AdressBookDataImplementation implements AddressBookInterface {
	JSONArray jsonArray;
	List<AddressBookData> addressBooks = new ArrayList<>();
	JSONObject jObject = new JSONObject();

	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{
			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\addressbook\\Model\\AdressBook.json"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(jsonArray);
			for (Object obj : jsonArray) {
				AddressBookData addressBook = new AddressBookData();
				jObject = (JSONObject) obj;
				String firstName = (String) jObject.get("firstName");
				String lastName = (String) jObject.get("lastName");
				String address = (String) jObject.get("address");
				String city = (String) jObject.get("city");
				String state = (String) jObject.get("state");
				Long zipcode = (Long) jObject.get("zipcode");
				Long phoneNumber = (Long) jObject.get("phoneNumber");

				addressBook.setFirstName(firstName);
				addressBook.setLastName(lastName);
				addressBook.setAddress(address);
				addressBook.setCity(city);
				addressBook.setState(state);
				addressBook.setZipcode(zipcode);
				addressBook.setPhoneNumber(phoneNumber);

				System.out.println(addressBook.toString());
				addressBooks.add(addressBook);
			}

		}
	}

	@Override
	public void add(String firstName, String lastName, String address, String city, String state, Long zipcode,
			Long phoneNumber) {
		// TODO Auto-generated method stub
		AddressBookData addressBook = new AddressBookData();
		addressBook.setFirstName(firstName);
		addressBook.setLastName(lastName);
		addressBook.setAddress(address);
		addressBook.setCity(city);
		addressBook.setState(state);
		addressBook.setZipcode(zipcode);
		addressBook.setPhoneNumber(phoneNumber);

		addressBooks.add(addressBook);

		addressBooks.forEach(personDetails -> System.out.println(personDetails.toString()));

	}

	@Override
	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(addressBooks);
		System.out.println(json);
		System.out.println(addressBooks);

		try (FileWriter file = new FileWriter(
				"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\addressbook\\Model\\AdressBook.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove() {
		// fileRead();
		System.out.println("enter which elements to be removed :");
		addressBooks.removeIf(inventory -> inventory.getFisrtName().equals(Functionalprogram.getInputString()));
		writeFile();
		System.out.println("SuccessFully Removed the Elements From The List");
	}

	@Override
	public void sortByLastName() {
		addressBooks.sort((AddressBookData s1, AddressBookData s2) -> s1.getLastName().compareTo(s2.getLastName()));
		addressBooks.forEach((s) -> System.out.println(s));
	}

	@Override
	public void sortByZipCode() {
		addressBooks.sort((AddressBookData s1, AddressBookData s2) -> s1.getLastName().compareTo(s2.getLastName()));
		addressBooks.forEach((s) -> System.out.println(s));

	}

}
