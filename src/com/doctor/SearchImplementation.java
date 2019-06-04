package com.doctor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.doctor.Appointment;
import com.doctor.Doctor;
import com.doctor.Search;
import com.doctor.Patient;
import com.bridgelabz.util.Utilityobject;

public class SearchImplementation implements Search{

//*@aim to search doctor from list


	static ObjectMapper mapper = new ObjectMapper();
	List<Patient> personlist = new ArrayList<>();
	List<Doctor> doctorlist = new ArrayList<>();
	List<Appointment> appointmentlist = new ArrayList<>();
	{
		try {
			//read files into arraylist
			personlist = mapper.readValue(
					new File("/home/user/Documents/program/avani/BridglabzJava/src/Doctor_/patients.json"),
					new TypeReference<List<Patient>>() {
					});
			doctorlist = mapper.readValue(
					new File("/home/admin1/eclipse-workspace/ObjectOrintedProgram/src/com/doctor/Doctor.json"),
					new TypeReference<List<Doctor>>() {
					});
			appointmentlist = mapper.readValue(new File(
					"/home/admin1/eclipse-workspace/ObjectOrintedProgram/src/com/doctor/Appoinment.json"),
					new TypeReference<List<Appointment>>() {
					});

		} catch (Exception e) {

		}
	}
	String name;
	String phone;
	int id;
	
//	@Override
	public void operation() {
		int Answer = 0;
		do {
			System.out.println("\n1. Search Doctor by Name");
			System.out.println("2. Search Doctor by id");
			System.out.println("3. Search Doctor by Specialization");
			System.out.println("4. Search Doctor by Availability");
			System.out.println("5. Search Patients by Name");
			System.out.println("6. Search Patients by id");
			System.out.println("7. Search Patients by Phone");
			System.out.println("8. Exit");
			Answer = Utilityobject.getInteger();
			switch (Answer) {
			case 1:
				searchByDoctorName(); //search doctor by name
				break;
			case 2:
				searchByDoctorId(); //search docor by id
				break;

			case 3:
				searchByDoctorSpecialization(); //search doctor by specialization
				break;

			case 4:
				searchByDoctorAvailability(); //search doctor by availability
				break;
			case 5:
				searchByPatientName(); //search patient by name
				break;
			case 6:
				serarchByPatientid(); //serach patient by id
				break;
			case 7:
				searchByPatientphone(); //search patient by phone number
				break;

			case 8:
				break;
			default:
				System.out.println("Invalid entry");
			}
		} while (Answer != 8);
	}

//	@Override
	//patient by name
	public void searchByPatientName() {
		// TODO Auto-generatimport Address_book.Utility;ed method stub
		System.out.println("Enter Name");
		name = Utilityobject.getString();
		List<Patient> listtemp = (List<Patient>) personlist.stream().filter(i -> i.getName().equals(name))
				.collect(Collectors.toList());
		System.out.println("[Name,id,age,phone]");
		for (int i = 0; i < listtemp.size(); i++) {
			System.out.println(listtemp.get(i).toString() + "  ");
		}

	}



	//patient by id
	public void serarchByPatientid() {
		// TODO Auto-generated method stub
		System.out.println("Enter id");
		id = Utilityobject.getInteger();
		try {
			List<Patient> listtemp = personlist.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
			System.out.println("[Name,id,age,phone]");
			System.out.println(listtemp.get(0).toString());
		} catch (Exception e) {
			System.out.println("Unknown Id");
		}

	}

//	@Override
	//search patient by phone number
	public void searchByPatientphone() {
		// TODO Auto-generated method stub
		System.out.println("Enter phone");
		phone = Utilityobject.getString();
		try {
			Patient obj = (Patient) (Object) personlist.stream().filter(i -> i.getPhone().equals(phone)).findFirst();
			System.out.println(obj.toString());
		} catch (Exception e) {
			System.out.println("Unknown Phone Number");
		}
	}

//	@Override
	//search doctor by name
	public void searchByDoctorName() {
		// TODO Auto-generated method stub

		System.out.println("Enter Name");
		name = Utility.getString();
		List<Doctor> listtemp = (List<Doctor>) doctorlist.stream().filter(i -> i.getName().equals(name))
				.collect(Collectors.toList());
		System.out.println("[Name,id,Availability,Specialist]");
		for (int i = 0; i < listtemp.size(); i++) {
			System.out.println(listtemp.get(i).toString() + "\t\t");
		}

	}

//	@Override
	//search doctor by id
	public void searchByDoctorId() {
		// TODO Auto-generated method stub
		System.out.println("Enter id");
		id = Utilityobject.getInteger();
		try {
			List<Doctor> listtemp = doctorlist.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
			System.out.println("Name     id      Availibility      Specialist");
			System.out.println(listtemp.get(0).toString());
		} catch (Exception e) {
			System.out.println("Unknown Id");
		}
	}

//	@Override
	//search doctor by specialization
	public void searchByDoctorSpecialization() {
		// TODO Auto-generated method stub
		System.out.println("Enter Specialization");
		name = Utilityobject.getString();
		List<Doctor> listtemp = (List<Doctor>) doctorlist.stream().filter(i -> i.getSpecialization().equals(name))
				.collect(Collectors.toList());
		System.out.println("Name     id      Availability      Specialist");
		for (int i = 0; i < listtemp.size(); i++) {
			System.out.println(listtemp.get(i).toString());
		}

	}
/***********
    @Override
   search doctor by availability
 */
	public void searchByDoctorAvailability() {
		// TODO Auto-generated method stub
		System.out.println("Enter Availability");
		name = Utilityobject.getString();
		List<Doctor> listtemp = (List<Doctor>) doctorlist.stream().filter(i -> i.getAvailability().equals(name))
				.collect(Collectors.toList());
		System.out.println("Name     id      Availability      Specialist");
		for (int i = 0; i < listtemp.size(); i++) {
			System.out.println(listtemp.get(i).toString());
		}
	}

}

