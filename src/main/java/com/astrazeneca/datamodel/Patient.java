package com.astrazeneca.datamodel;

import com.astrazeneca.entity.PatientEntity;

public class Patient {

	private int patientId;
	private String patientName;
	private String patientAddress;
	private String deceaseType;

	public Patient(int patientId, String patientName, String patientAddress, String diseaseType) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.deceaseType = diseaseType;
	}

	public Patient(){}
	public Patient(PatientEntity pe) {
		this.patientId = pe.getPatientId();
		this.patientName = pe.getPatientName();
		this.patientAddress = pe.getPatientAddress();
		this.deceaseType = pe.getDeceaseType();
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getDiseaseType() {
		return deceaseType;
	}

	public void setDiseaseType(String diseaseType) {
		this.deceaseType = diseaseType;
	}

}
