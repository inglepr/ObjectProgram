package com.bridgelabz.objectprogram;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.util.Utilityobject;


public class Demo {

	  public static void main(String[] args)
	    {
			// giving file path 
	    	String filePath="/home/admin1/eclipse-workspace/ObjectOrintedProgram/src/com/bridgelabz/objectprogram/RegularExpretion";
		    File expressionFile=new File(filePath);
		    //Using objectMapper class to read the file or to write details into file  
			ObjectMapper mapper=new ObjectMapper();
			//Scanner class is used for taking user input 
			try
			{
				//Read the details from file by using readTree method 
				JsonNode filRead =mapper.readTree(expressionFile);
				JsonNode expression=filRead.get("RegularExpression");
				String regularExpression=expression.asText();
				//Printing details on console 
				System.out.println(regularExpression);
				System.out.println("Enter your name ");
				String name=Utilityobject.getString();
				if(Pattern.matches("[a-zA-Z]+", name))
				{
					regularExpression=regularExpression.replaceAll("<<name>>", name);						
				}
				else
				{
					System.err.println("You entered wrong details at name ");
				}
				System.out.println("Enter your full name ");
				String fullName=Utilityobject.getString();
				//Using regular expressions 
				if(Pattern.matches("[a-zA-Z]+", fullName))
				{
					regularExpression=regularExpression.replaceAll("<<full name>>", fullName);						
				}
				else
				{
					System.err.println("You entered wrong details at mobilenumber ");
				}
				System.out.println("Enter your mobile number ");
			    String number=Utilityobject.getString();
				if(Pattern.matches("[789][0-9]{9}+", number))
				{
					regularExpression=regularExpression.replaceAll("xxxxxxxxxx", number);						
				}
				else
				{
					System.err.println("You entered wrong details at mobilenumber ");
				}
				//using date class we get the today date 
				Date todayDate=new Date();
				// To get format we using simpleDateFormat method . 
				SimpleDateFormat datefar=new SimpleDateFormat("dd/MM/yyyy");
				String date=datefar.format(todayDate);
				regularExpression=regularExpression.replaceAll("01/01/2016", date);									
				System.out.println(regularExpression);
			}
			//To catch the exception 
			catch (IOException e)
			{			
				System.err.println("Please Give Valid File Details");
			} 
	    
	    }
	}
	
	
	
	
	