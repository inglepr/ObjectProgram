package com.Commercialdata;




public class Stock {
	private String stockName;
	private int number;
	private double price;
	public Stock()
	{
		
	}
	public Stock(String stockName, int number, double price) {
		
		this.stockName = stockName;
		this.number = number;
		this.price = price;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", number=" + number + ", price=" + price + "]";
	}
	
	
	

}