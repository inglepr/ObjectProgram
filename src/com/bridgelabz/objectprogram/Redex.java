package com.bridgelabz.objectprogram;
import com.bridgelabz.util.Utilityobject;



public class Redex {
	private static final String date = null;

	

		public static void main(String[] args) {
			
			String name = null, fullName = null, date = null,mobile=null;
			String msg = "Hello <<name>>, We have your full\n"
					+ "name as <<fullname>> in our system. your contact number is 91-XXXXXXXXXX.\n"
					+ "Please,let us know in case of any clarification Thank you BridgeLabz XX/XX/XXXX.";
			System.out.println("Enter the First Name:");
			name=Utilityobject.getString();
			System.out.println("Enter The Full Name:");
			fullName=Utilityobject.getString();
			System.out.println("Enter the Mobile Number:");
			mobile=Utilityobject.getString();
			System.out.println("Enter the date:");
			date=Utilityobject.getString();
			System.out.println("===================Orignal Message================");
			System.out.println(msg);
			System.out.println();
			if (Utilityobject.validateName(name)) {
				msg = msg.replaceAll("<<name>>",name);
			}
			if(Utilityobject.validatefullName(fullName)) {
				msg=msg.replaceAll("<<fullname>>",fullName);
			}
			if(Utilityobject.validatemobileNumber(mobile)) {
				msg=msg.replaceAll("XXXXXXXXXX",mobile);
			}
			if(Utilityobject.validateDate(date)) {
				msg=msg.replaceAll("XX/XX/XXXX",date);
			}
			 
			System.out.println("===================Modified Message================");
			System.out.println(msg);
			System.out.println();
		}}
