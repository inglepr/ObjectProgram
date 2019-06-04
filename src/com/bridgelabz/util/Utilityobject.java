package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;






public class Utilityobject {


		public static Scanner sc=new Scanner(System.in);


		//======================  To get Integer using scanner class  =============================================
			
			public static int getInteger() {
				return sc.nextInt();
			}
			//======================  To get Integer using scanner class  =============================================
			
					public static int getClose() {
						return sc.nextInt();
					}
		//======================To get double using scanner class =================================================
			
			public static double getDouble() {
				return sc.nextDouble();	
			}
				
		//=======================To get string using scanner class ================================================

			public static String getString() {
				return sc.next();	
			}
			public static Object getFormatedDate(Date date) {
				// TODO Auto-generated method stub
				return null;}
			
			//=======================redex================================
		
			public static boolean validateName(String name) {
				String regx=("[a-zA-z]+\\.?");
				   // Input String for matching the regex pattern
				Pattern pattarn=Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
				//// Pattern.compile(regex, Pattern.CASE_INSENSITIVE);  // for case-insensitive matching

			Matcher matcher=pattarn.matcher(name);//Allocate a matching engine from the compiled regex pattern,
		      //         and bind to the input string
				return matcher.find();//find the matcher
			}
			public static boolean validatemobileNumber(String mobNo) {
				
				String regx="^[0-9] {10}$";
				Pattern pattarn=Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
				Matcher matcher=pattarn.matcher(mobNo);
				return matcher.find();
				
	}
public static boolean validatefullName(String fullName) {
				
				String regx="^([a-zA-Z]{2,}\\s[a-zA-z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)";
				Pattern pattarn=Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
				Matcher matcher=pattarn.matcher(fullName);
				return matcher.find();
				
			}
public static boolean validateDate(String date) {
	
	String regx="\\\\d{2}/\\\\d{2}/\\\\d{4}";
	Pattern pattarn=Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
Matcher matcher=pattarn.matcher(date);
	return matcher.find();
}

}


	//read stock===================================
/*public <SortingFunction> ArrayList<Stock> getStockDetails(String fileName){
	ArrayList<Stock> stockList=new ArrayList<Stock>();
	BufferedReader br=null;
	try{
		br=new BufferedReader(new FileReader(fileName));
		StringBuilder sb=new StringBuilder();
		String line=br.readLine();
		SortingFunction sortingFunction=new SortingFunction();
		while(line!=null){
			String words[]=sortingFunction.wordsArrayFromStatement(line);
			try{
				stockList.add(new Stock(words[0],Integer.parseInt(words[1]),Integer.parseInt(words[2])));
			}
			catch(NumberFormatException nfe){
			}
			catch(ArrayIndexOutOfBoundsException ae){
			}
			line=br.readLine();
		}
		return stockList;
	 }
	catch(Exception e){
		return null;
	}
	finally{
		try{
			br.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}	
	}
}}*/

///==============Queue Stock=========================
	