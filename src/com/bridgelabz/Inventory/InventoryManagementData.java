package com.bridgelabz.Inventory;

import org.json.simple.JSONObject;

public class InventoryManagementData {
	private String name;
	private double price;
	private double weight;

//converting JsonObject to Inventory
	public InventoryManagementData(JSONObject object) {
		this.name = (String) object.get("name");
		this.price = (Double) object.get("price");
		this.weight = (Double) object.get("weight");
	}

	public InventoryManagementData() {
		// TODO Auto-generated constructor stub
	}

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
	public double getCalculatedValue() {
		return (price*weight);
	}

	@Override
	public String toString() {
		return "name: " + name + "\n " + "weight" + weight + "\n" + "price" + price;
	}
}
