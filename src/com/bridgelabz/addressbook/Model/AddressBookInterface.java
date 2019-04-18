package com.bridgelabz.addressbook.Model;

public interface AddressBookInterface {
	public void fileRead();

//	public void add(String firstName, String lastName, String address, String city, String state, Long zipcode,
//			long phoneNumber);

	public void writeFile();

	public void remove();

	public void sortByLastName();

	public void sortByZipCode();

	void add(String firstName, String lastName, String address, String city, String state, Long zipcode,
			Long phoneNumber);
}
