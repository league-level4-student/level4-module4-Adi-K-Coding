package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addDoctor(Doctor type) {
		doctors.add(type);
	}

	public void addPatient(Patient patient) {
		

	}

	public List<Doctor> getPatients() {
		return null;
		
	}

	public void assignPatientsToDoctors() {

	}

}
