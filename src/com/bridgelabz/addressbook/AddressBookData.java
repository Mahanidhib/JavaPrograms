package com.bridgelabz.addressbook;

public class AddressBookData {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	private Long zipcode;
	private Long phoneNumber;

	public String getFisrtName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "firstName: " + firstName + "\n " + "lastName:" + lastName + "\n" + "address:" + address + "\n" + "city:"
				+ city + "\n" + "state:" + state + "\n" + "zipcode:" + zipcode + "\n" + "phoneNumber:" + phoneNumber
				+ "\n";
	}
}