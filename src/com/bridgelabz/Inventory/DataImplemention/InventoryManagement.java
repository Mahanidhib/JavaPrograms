package com.bridgelabz.Inventory.DataImplemention;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.inventoryManagementData.InventoryInterface;
import com.bridgelabz.util.Functionalprogram;
import com.google.gson.Gson;
import com.bridgelabz.inventoryManagement.model.Inventory;

public class InventoryManagement implements InventoryInterface {
	JSONArray jsonArray;
	List<Inventory> inventories = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				try {
					jsonArray = (JSONArray) parser.parse(new FileReader(
							"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\inventoryManagement\\model\\Inventory.json"));
				} catch (org.json.simple.parser.ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("====>>" + jsonArray);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (Object obj : jsonArray) {
				Inventory inventory = new Inventory();

				jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				double price = ((Double) jobject.get("price")).doubleValue();
				double weight = ((Double) jobject.get("weight")).doubleValue();
				inventory.setWeight(weight);
				inventory.setName(name);

				inventory.setPrice(price);
				inventories.add(inventory);

				System.out.println(inventory.toString());

			}
		}
	}

	@Override
	public void calculateInventory() {
		inventories.forEach(inventory -> System.out.println(
				"Total price of " + inventory.getName() + "is" + (inventory.getPrice() * inventory.getWeight())));

	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(inventories);
		System.out.println(json);
		System.out.println("===>" + inventories);

		try (FileWriter file = new FileWriter(
				"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\inventoryManagement\\model\\Inventory.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n JSON Object " + json);
	}

	@Override
	public void addInventory(String name, double weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setPrice(price);
		inventory.setWeight(weight);
		inventories.add(inventory);
		inventories.forEach(inventory1 -> System.out.println(inventory1.toString()));

	}

	@Override
	public void removeInventory(String name) {

		System.out.println("enter the name you wan to delete");

		String name1 = Functionalprogram.getInputString();

		inventories.removeIf(inventory2 -> inventory2.getName().equals(name1));
		System.out.println(inventories);
		System.out.println("removed successfully");
		writeFile();

	}
}
