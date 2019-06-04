package com.doctor;



/**
 * @aim interface for doctor and patient data
 */
public interface DoctorAndPatientData {
	public void operation();
	void addPatient();
	void deletePatient();
	void addDoctor();
	void deleteDoctor();
	void fixAppointment();
	void save();
}
