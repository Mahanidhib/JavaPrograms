package com.bridgelabz.stockAccount.main;

import com.bridgelabz.stockAccountData.StockAccountService;
import com.bridgelabz.stockAccountImpl.StockAccountServiceImpl;
import com.bridgelabz.util.Functionalprogram;

public class MyStockAccount {

		public static void main(String[] args) {

			StockAccountService stockImp = new StockAccountServiceImpl();
			
			
			
			{

	            stockImp.createStockAccount();
			    System.out.println("Input choice");
			    int input = Functionalprogram.getInputInteger();
				switch (input) {
				
	            case 1:
	            	System.out.println("Choose a stock Company you want to buy");
	    			String StockCompany= Functionalprogram.getInputString();
	    			System.out.println("Enter the amount you are buying for:");
	    			double sharePrice= Functionalprogram.getInputDoubleModel();
	    			stockImp.buy(StockCompany,sharePrice);
	    			stockImp.save();
	    			break;
	    		case 2:
	                System.out.println("Choose a stock Company you want to sell");
	    			String SellCompany=Functionalprogram.getInputString();
	    			System.out.println("Enter the amount you are selling for:");
	    			double sharePrice1= Functionalprogram.getInputDoubleModel();
	    			stockImp.sell(SellCompany,sharePrice1);
	    			stockImp.save();
	    			break;
	       	  case 3:
	                stockImp.valueOf();
	                break;
	       	  case 4:
	       		    stockImp.printReport();
	       		    break;
				}

				
				
		
	             
				}
		

		}

	}


