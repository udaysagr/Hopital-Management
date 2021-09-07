package com.htc.patientmanagement.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PATIENT")
public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8439626661947507411L;
	
	@Id
	private long patientId;
	private String firstName;
	private String lastName;
	private long mobileNumber;
	private String disease;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(long patientId, String firstName, String lastName, long mobileNumber, String disease) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.disease = disease;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobileNumber, patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return mobileNumber == other.mobileNumber && patientId == other.patientId;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", disease=" + disease + "]";
	}


}
