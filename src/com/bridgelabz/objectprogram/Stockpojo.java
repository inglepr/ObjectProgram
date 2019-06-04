package com.bridgelabz.objectprogram;

import java.util.List;
import java.util.Stack;

public class Stockpojo 
{
	  private int Stocks;
		private String name;
		private int NumberofShare;
		private int SharePrice;
	private String symbolValue;
	private String dateTime;
	private int price;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumberofShare() {
			return NumberofShare;
		}
		
		public void setNumberofShare(int numberofShare) {
		this.NumberofShare = numberofShare;
		}

	
		public int getSharePrice() {
			return SharePrice;
		}

		

		public void setSharePrice(int sharePrice) {
			SharePrice = sharePrice;
		}

		public int getStocks() {
			
			return Stocks ;
		}
public void setStocks(int Stocks) {
	this.Stocks=Stocks;
}
		public String getTotalStockValue() {
			// TODO Auto-generated method stub
			return null;
		}

		public void getStocks(List<Stack> stocks2) {
			// TODO Auto-generated method stub
			
		}
		public void setSymbolValue(String symbol) {
			this.symbolValue = symbol;
		}

		public String getSymbolValue() {
			return symbolValue;
		}
		public void setPrice(int price) {
			this.price = price;
		}

		/// For time
		public String getDateTime() {
			return dateTime;
		}

		public void setDateTime(String dateTime) {
			dateTime = java.util.Calendar.getInstance().getTime().toString();
			this.dateTime = dateTime;
		}
		public  void CompanyShares(String companyName, String stockSymbol, int noOfShares, int price) {
			//super();
			this.name = companyName;
			this.Stocks = Stocks;
			this.NumberofShare = noOfShares;
			this.price = price;
		

		}
		public void CompanyShares() {
			
		}
		}
	


