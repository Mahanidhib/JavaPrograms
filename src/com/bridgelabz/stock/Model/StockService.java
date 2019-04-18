package com.bridgelabz.stock.Model;

import java.io.IOException;

public interface StockService {
	public void fileRead();

	public void addStock(String name, Long numberofShares, Double sharePrice) throws IOException;

	public void writeFile() throws IOException;

	public void calculateStock();

}
