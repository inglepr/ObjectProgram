package com.Commercialdata;

import java.util.Scanner;

public class CommertialProgramMain 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		boolean value = true;

		while(value)
		{
			StockAccount stockAccRef = new StockAccount();

			System.out.println("Click on number based On your needs");
			System.out.println("   ");
			System.out.println("1. Add Stock Account");
			System.out.println("2. Get Total Value of Stock Present at User");
			System.out.println("3. Buy Shares");
			System.out.println("4. Sell Shares");
			System.out.println("5. Print All Details");
			System.out.println("6. Exit ");
			System.out.println();
			int n=scan.nextInt();
			switch(n)
			{
				case 1:StockAccount newStock = new StockAccount("/home/admin1/eclipse-workspace/ObjectOrintedProgram/src/com/Commercialdata/Customar.json");
						break;

				case 2:	double totalValue = stockAccRef.valueOf();
						if(totalValue >= 0)
						{
							System.out.println(totalValue);
						}
						break;


				case 3: System.out.println("Enter number of shares");
						int shares = scan.nextInt();
						System.out.println("Enter the Symbol of the Company");
						String symbol = scan.next().toUpperCase();
						stockAccRef.buy(shares, symbol);
						break;

				case 4: System.out.println("Enter number of shares");
						shares = scan.nextInt();
						System.out.println("Enter the Symbol of the Company");
						symbol = scan.next().toUpperCase();
						stockAccRef.sell(shares, symbol);
						break;

				case 5: stockAccRef.printReport();
						break;

				case 6: value = false;
						break;

				default: System.out.println("invalid choice");
			}			

		}
		scan.close();
	}
}

	
	
	
