package com.astrazeneca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.astrazeneca.datamodel.Patient;

@Entity
@Table(name = "PATEINT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	@Column(name = "PATIENT_NAME")
	private String patientName;
	@Column(name = "PATIENT_ADDRESS")
	private String patientAddress;
	@Column(name = "PATIENT_DECEASE_TYPE")
	private String deceaseType;

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

	public String getDeceaseType() {
		return deceaseType;
	}

	public void setDeceaseType(String deceaseType) {
		this.deceaseType = deceaseType;
	}

	public PatientEntity(int patientId, String patientName, String patientAddress, String deceaseType) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.deceaseType = deceaseType;
	}

	public PatientEntity(Patient p) {
		super();
		this.patientId = p.getPatientId();
		this.patientName = p.getPatientName();
		this.patientAddress = p.getPatientAddress();
		this.deceaseType = p.getDiseaseType();
	}
	 public PatientEntity(){}

}
