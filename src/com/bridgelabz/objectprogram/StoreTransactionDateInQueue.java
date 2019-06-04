package com.bridgelabz.objectprogram;

import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.objectprogram.Queue;


import com.bridgelabz.objectprogram.CommercialPojo;
public class StoreTransactionDateInQueue {

	public static void main(String args[]) throws JsonMappingException, IOException {
		String companyName = null;
		String symbol = null;
		// object of queue class
		ObjectMapper mapper = new ObjectMapper();
		Queue<String> queue = new Queue<String>(); // create object of queue class
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // set date and time format
		LocalDateTime now = LocalDateTime.now(); // get current time
		String date = (dtf.format(now));
		// read file data into linked list
		LinkedList<CommercialPojo> data1 = mapper.readValue(new File(
				"/home/admin1/eclipse-workspace/ObjectOrintedProgram/src/com/bridgelabz/objectprogram/Commarecial.json"),
				new TypeReference<LinkedList<CommercialPojo>>() {
				});
		int i = 0;
		int size = data1.size();
		// check if file is empty
		if (size == 0)
			System.out.println("\nno data found");
		// if file is not empty then print details
		else {

			for (i = 0; i < data1.size(); i++) {
				StringBuffer buffer=new StringBuffer();
				companyName = data1.get(i).getCompanyName().trim();
				buffer.append(companyName+" ");
				
				symbol = data1.get(i).getSymbol().trim();
				buffer.append(symbol+" ");
				date = data1.get(i).getDate().trim();
				buffer.append(date+" ");
				queue.enqueue(buffer.toString()) ;// add data to queue
			}
		}
		System.out.println("  company\tsymbol\t  date & time of transaction\n");
		queue.display();

	}

}
