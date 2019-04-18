package com.bridgelabz.Inventory.main;

import java.io.IOException;

import com.bridgelabz.Inventory.DataImplemention.InventoryManagement;
import com.bridgelabz.inventoryManagementData.InventoryInterface;
import com.bridgelabz.util.Functionalprogram;

public class InventoryMain {

	public static void main(String[] args) throws IOException {

		InventoryInterface inventaryImp = new InventoryManagement();
		{
			inventaryImp.fileRead();
			System.out.println("enter name");
			String name = Functionalprogram.getInputString();
			System.out.println("enter weight");
			int weight = Functionalprogram.getInputInteger();
			System.out.println("enter price");
			double price = Functionalprogram.getInputDoubleModel();
			inventaryImp.addInventory(name, weight, price);
			inventaryImp.calculateInventory();
			inventaryImp.writeFile();
			inventaryImp.removeInventory(name);
		}

	}
}