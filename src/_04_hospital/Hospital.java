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
		patients.add(patient);

	}

	public List<Patient> getPatients() {
		return patients;

	}

	public void assignPatientsToDoctors() {
		int doctorNumber = 0;
		for (int k = 0; k < patients.size(); k++) {
			try {
				doctors.get(doctorNumber).assignPatient(patients.get(k));
			} catch (DoctorFullException e) {
				doctorNumber += 1;
				k -= 1;
			}

		}
	}

}
