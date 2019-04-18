package com.bridgelabz.inventoryManagement.model;

public class Inventory {
	private String name;
	private double price;
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public double getWeight() {
		return weight;

	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name: " + name + "\n " + "weight" + weight + "\n" + "price" + price;
	}
}