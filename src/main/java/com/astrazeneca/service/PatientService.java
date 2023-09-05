package com.astrazeneca.service;

import java.util.List;

import com.astrazeneca.datamodel.Patient;

public interface PatientService {
	public List<Patient> getAllPatientDetails();
	public Patient getPatient(Integer id);
	public Patient addPatient(Patient p);

}
