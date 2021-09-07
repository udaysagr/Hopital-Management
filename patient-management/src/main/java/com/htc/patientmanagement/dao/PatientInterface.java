package com.htc.patientmanagement.dao;

import java.util.List;

import com.htc.patientmanagement.entity.Patient;

public interface PatientInterface {

	public boolean addPatient(Patient patient);
	public boolean updatePatient(long id,String disease);
	public boolean deletepatient(long patientid);
	public Patient getPatientById(long patientId);
	public List<Patient> getAllPatients();
	
	
	/*
	 * public Patient getByFirstName(String patientFirstName); public Patient
	 * getByLastName(String patientLastName); public Patient getByPhoneNumber(long
	 * phoneNumber);
	 */

}
