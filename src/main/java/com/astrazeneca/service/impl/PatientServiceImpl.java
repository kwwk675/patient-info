package com.astrazeneca.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astrazeneca.datamodel.Patient;
import com.astrazeneca.entity.PatientEntity;
import com.astrazeneca.repository.PatientRepository;
import com.astrazeneca.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	List<Patient> patientList = Stream.of(new Patient(1, "abc", "chennai", "left-knee-replacement"),
			new Patient(2, "xyz", "hyderabad", "right-knee-replacement"),
			new Patient(3, "ghs", "mumbai", "knee-replacement"),
			new Patient(4, "kkk", "andhrapradesh", "knee-replacement")).collect(Collectors.toList());

	@Override
	public List<Patient> getAllPatientDetails() {

		return patientRepository.findAll().stream().map(p -> new Patient(p)).collect(Collectors.toList());

	}

	@Override
	public Patient getPatient(Integer id) {
		return new Patient(patientRepository.getById(id));
	}

	@Override
	public Patient addPatient(Patient p) {
		
		PatientEntity patient = new PatientEntity(p);
		
		patientRepository.save(patient);

		return p;
	}

}
