package com.bridgelabz.stock.main;

import java.io.IOException;

import com.bridgelabz.stock.Implementation.StockServiceimpl;
import com.bridgelabz.stock.Model.StockService;
import com.bridgelabz.util.Functionalprogram;

public class StockMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StockService imp = new StockServiceimpl();
		{
			imp.fileRead();
			System.out.print("enter Stock Name  ");
			String stockName = Functionalprogram.getInputString();
			System.out.print("enter Number of shares ");
			Long numberofShare = Functionalprogram.getInputLong();
			System.out.print("Enter share price  ");
			Double sharePrice = Functionalprogram.getInputDoubleModel();
			imp.addStock(stockName, numberofShare, sharePrice);
			imp.calculateStock();
			imp.writeFile();

		}

	}

}
