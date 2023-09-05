package com.astrazeneca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astrazeneca.datamodel.Patient;
import com.astrazeneca.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	PatientService patientService;
	@GetMapping()
	public String getStart() {
		return "Welcome";
	}

	@GetMapping("all")
	public List<Patient> getAllPatientDetails() {

		System.out.println("Inside the controller");
		return patientService.getAllPatientDetails();
	}

	@GetMapping("{id}")
	public Patient getPatient(@PathVariable("id") Integer id) {
		return patientService.getPatient(id);
	}

	@PostMapping("add")
	public String addPatient(@RequestBody Patient p) {

		patientService.addPatient(p);
		return "Successfully added patient!!";
	}

}
