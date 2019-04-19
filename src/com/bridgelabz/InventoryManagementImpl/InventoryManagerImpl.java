package com.bridgelabz.InventoryManagementImpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.InteventoryManagementData.InventoryFactory;
import com.bridgelabz.InteventoryManagementInterface.InventoryManager;
import com.bridgelabz.Inventory.InventoryManagementData;
import com.google.gson.Gson;

public class InventoryManagerImpl implements InventoryManager {
	private List<InventoryManagementData> riceItems;
	private List<InventoryManagementData> wheatItems;
	private List<InventoryManagementData> pulseItems;

	private Gson gson;

	public InventoryManagerImpl() {
		fileRead();
		this.gson = new Gson();
	}

	private void fileRead() {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(
					"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\InteventoryManagementData\\InventoryManagement.json");
			Object obj = parser.parse(reader);

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray riceArray = (JSONArray) jsonObject.get("rice");
			riceItems = getInventories(riceArray);
			JSONArray wheatArray = (JSONArray) jsonObject.get("wheat");
			wheatItems = getInventories(wheatArray);
			JSONArray pulseArray = (JSONArray) jsonObject.get("pulses");
			pulseItems = getInventories(pulseArray);

		} catch (Exception e) {
		}
	}

	private List<InventoryManagementData> getInventories(JSONArray array) {
		List<InventoryManagementData> inventories = new ArrayList<>();
		for (Object object : array) {
			InventoryManagementData inventory = new InventoryManagementData((JSONObject) object);
			inventories.add(inventory);
		}
		return inventories;
	}

	public void addInventory(String name, int weight, double price) {
		InventoryManagementData inventory = new InventoryManagementData();
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		riceItems.add(inventory);
		// wheatItems.add(inventory);
		// pulseItems.add(inventory);
		riceItems.forEach(inventory1 -> System.out.println(inventory1.toString()));
	}

	@Override
	public void calculateInventoryPrice() {
		double totalValueOfRice = getTotalValue(riceItems);
		double totalValueOfWheat = getTotalValue(wheatItems);
		double totalValueOfPulses = getTotalValue(pulseItems);
		System.out.println("Total value of rice is :- " + totalValueOfRice);
		System.out.println("Total value of wheat is :- " + totalValueOfWheat);
		System.out.println("Total value of pulses is :- " + totalValueOfPulses);
		writeInventoryToFile();
		// rice.stream().map(Inventory::getCalculatedValue).reduce(0.0, Double::sum);
	}

	private double getTotalValue(List<InventoryManagementData> items) {
		double totalValueOfItem = 0.0;
		for (InventoryManagementData inventory : items) {
			totalValueOfItem += inventory.getCalculatedValue();
		}
		return totalValueOfItem;
	}

	private void writeInventoryToFile() {
		try {
			InventoryFactory factory = new InventoryFactory(riceItems, wheatItems, pulseItems);
			String json = gson.toJson(factory);
			@SuppressWarnings("resource")
			FileWriter file = new FileWriter(
					"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\InteventoryManagementData\\InventoryManagement.json");
			file.write(json);
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
