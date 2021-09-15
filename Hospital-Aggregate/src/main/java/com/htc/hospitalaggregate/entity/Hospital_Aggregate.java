package com.htc.hospitalaggregate.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Hospital_Aggregate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2898336785694826520L;
	
	private long patientId;
	private String firstName;
	private String lastName;
	private long mobileNumber;
	private String disease;
	
	private List<Hospital> hospital;

	public Hospital_Aggregate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital_Aggregate(long patientId, String firstName, String lastName, long mobileNumber, String disease,
			List<Hospital> hospital) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.disease = disease;
		this.hospital = hospital;
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

	public List<Hospital> getHospital() {
		return hospital;
	}

	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
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
		Hospital_Aggregate other = (Hospital_Aggregate) obj;
		return mobileNumber == other.mobileNumber && patientId == other.patientId;
	}

	@Override
	public String toString() {
		return "Hospital_Aggregate [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", disease=" + disease + ", hospital=" + hospital + "]";
	}
	
	
}
