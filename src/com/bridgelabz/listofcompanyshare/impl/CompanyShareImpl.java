package com.bridgelabz.listofcompanyshare.impl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.common.CustomLinkedList;
import com.bridgelabz.listofcompanyshare.Model.CompanyShare;
import com.bridgelabz.listofcompanyshare.data.CompanyShareInterface;
import com.bridgelabz.util.Functionalprogram;
import com.google.gson.Gson;

public class CompanyShareImpl implements CompanyShareInterface {
	JSONArray jsonArray;
	CompanyShare shares = new CompanyShare();

	List<CompanyShare> list = new ArrayList<>();
	CustomLinkedList<CompanyShare> linkedList = new CustomLinkedList<>();
	JSONObject jobject = new JSONObject();

	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		FileReader fr;
		try {
			fr = new FileReader(
					"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\stock\\Data\\Stock.json");
			jsonArray = (JSONArray) parser.parse(fr);
		} catch (IOException | org.json.simple.parser.ParseException e) {

			e.printStackTrace();
		}
		for (Object obj : jsonArray) {
			CompanyShare comShare = new CompanyShare();
			jobject = (JSONObject) obj;
			String name = (String) jobject.get("Stockname");
			Long noOfShare = (Long) jobject.get("NumberofShares");
			comShare.setComapanyName(name);
			comShare.setNoOfShare(noOfShare);
			linkedList.add(comShare);

		}
	}

	@Override
	public void add() {
		System.out.println("linked  list before adding:");
		linkedList.printList();
		CompanyShare share = new CompanyShare();
		System.out.println("enter company name to add");
		String name = Functionalprogram.getInputString();
		System.out.println("enter the number of share");
		Long noOfShare = Functionalprogram.getInputLong();
		String name1 = share.setComapanyName(name);
		Long noshare = share.setNoOfShare(noOfShare);
		linkedList.add(share);
		System.out.println("linked  list after adding:");
		linkedList.printList();
		System.out.println(linkedList.size());
	}

	@Override
	public void remove(String name) {

		System.out.println("Linked List" + new Gson().toJson(linkedList));

		for (CompanyShare share : linkedList) {
			if (share != null && share.getComapanyName().equals(name)) {
				linkedList.remove(share);
			}

		}
		System.out.println("removed");
		System.out.println("linked  list after removing:");
		linkedList.printList();
	}

	@Override
	public void writeFile() {
		Gson gson = new Gson();
		System.out.println("list to be written into file");
		linkedList.printList();
		String g = gson.toJson(linkedList);
		System.out.println("writing into file");
		System.out.println("content" + g);

		try {
			FileWriter file = new FileWriter(
					"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\stock\\Data\\Stock.json");
			file.write(g);
			file.flush();
			System.out.println("written into file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
