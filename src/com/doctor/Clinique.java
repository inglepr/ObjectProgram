package com.doctor;

import java.text.ParseException;
import java.util.Date;

import com.doctor.SearchImplementation;
import com.bridgelabz.util.Utilityobject;

/**
 * @aim runner class for clinique management
 */
public class Clinique {
	static Date date;
	public static void main(String[] args) throws ParseException {
		int choice = 0;
		do {
			System.out.println(
					"\n1. Add Doctor or Patient or fix an Appointment\n2. Search doctor\n3. Display details\n4. Close");
			choice = Utilityobject.getInteger();
			switch (choice) {
			case 1:
				 // to add doctor or patients details or to fix appointment 
				new DoctorPatientImplementation().operation();
				break;
			case 2:
				new SearchImplementation().operation(); // to search doctor details
				break;
			case 3:
				new InformationDisplayImplementation().operation(); 	// to display information
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 4);
	}
}