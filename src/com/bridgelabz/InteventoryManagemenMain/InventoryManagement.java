package com.bridgelabz.InteventoryManagemenMain;

import java.io.FileNotFoundException;

import com.bridgelabz.InteventoryManagementInterface.InventoryManager;
import com.bridgelabz.InventoryManagementImpl.InventoryManagerImpl;

public class InventoryManagement {

	public static void main(String[] args) throws FileNotFoundException {
		InventoryManager imp = new InventoryManagerImpl();
		imp.calculateInventoryPrice();

	}

}
