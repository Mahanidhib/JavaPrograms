package com.bridgelabz.stock.Implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.stock.Data.Stock;
import com.bridgelabz.stock.Model.StockService;
import com.google.gson.Gson;

public class StockServiceimpl implements StockService {
	JSONArray jsonArray;
	List<Stock> stocks = new ArrayList<>();
	JSONObject jobject = new JSONObject();

	@Override
	public void fileRead() {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		{

			try {
				try {
					jsonArray = (JSONArray) parser.parse(new FileReader(
							"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\stock\\Data\\Stock.json"));
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
				Stock stock = new Stock();

				jobject = (JSONObject) obj;
				String stockName = ((String) jobject.get("Stockname"));
				Long numberofShares = ((Long) jobject.get("NumberofShares"));
				Double sharePrice = ((Double) jobject.get("SharePrice"));
				stock.setStockname(stockName);
				stock.setNumberofShares(numberofShares);
				stock.setSharePrice(sharePrice);

				stocks.add(stock);

				System.out.println(stocks.toString());

			}
		}

	}

	@Override
	public void addStock(String name, Long numberofShares, Double sharePrice) throws IOException {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
		stock.setStockname(name);
		stock.setNumberofShares(numberofShares);
		stock.setSharePrice(sharePrice);
		stocks.add(stock);
		stocks.forEach(stock1 -> System.out.println(stock1.toString()));

	}

	@Override
	public void writeFile() throws IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String json = gson.toJson(stocks);
		System.out.println(json);
		System.out.println("===>" + stocks);

		try (FileWriter file = new FileWriter(
				"E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\stock\\Data\\Stock.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n JSON Object " + json);
	}

	@Override
	public void calculateStock() {
		// TODO Auto-generated method stub
		stocks.forEach(stock -> System.out.println("Total price of " + stock.getStockname() + " is"
				+ (stock.getNumberofShares() * stock.getSharePrice())));

	}

}
