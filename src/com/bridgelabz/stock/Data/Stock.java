package com.bridgelabz.stock.Data;

public class Stock {
	private String Stockname;
	private Long NumberofShares;
	private Double SharePrice;

	public String getStockname() {
		return Stockname;
	}

	public void setStockname(String stockName) {
		this.Stockname = stockName;
	}

	public Long getNumberofShares() {
		return NumberofShares;
	}

	public void setNumberofShares(Long numberofShares) {
		NumberofShares = numberofShares;
	}

	public Double getSharePrice() {
		return SharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		SharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "name: " + Stockname + "\n " + NumberofShares + "\n" + "SharePrice" + SharePrice;
	}

}
