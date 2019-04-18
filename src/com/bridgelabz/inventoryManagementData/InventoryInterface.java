package com.bridgelabz.inventoryManagementData;

import java.io.IOException;

public interface InventoryInterface {
	public void fileRead();

	public void addInventory(String name, double weight, double price) throws IOException;

	public void writeFile() throws IOException;

	public void removeInventory(String name);

	public void calculateInventory();

	// public void calculateInventory(String name, double weight, double price);

}
