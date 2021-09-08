package com.htc.patientmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.patientmanagement.dao.PatientInterface;
import com.htc.patientmanagement.dao.PatientInterfaceRepo;
import com.htc.patientmanagement.entity.Patient;

@Service
public class PatientServiceImplementation implements PatientServiceInterface {

	@Autowired
	private PatientInterface patientInterface;
	
	@Autowired
	private PatientInterfaceRepo patientInterfaceRepo;
	
	@Override
	public boolean addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientInterface.addPatient(patient);
	}

	@Override
	public boolean updatePatient(long id, String disease) {
		// TODO Auto-generated method stub
		return patientInterface.updatePatient(id, disease);
	}

	@Override
	public boolean deletepatient(long patientid) {
		// TODO Auto-generated method stub
		return patientInterface.deletepatient(patientid);
	}

	@Override
	public Patient getPatientById(long patientId) {
		// TODO Auto-generated method stub
		return patientInterface.getPatientById(patientId);
	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientInterface.getAllPatients();
	}

	@Override
	public Patient getByFirstName(String patientFirstName) {
		// TODO Auto-generated method stub
		return patientInterfaceRepo.findByFirstname(patientFirstName);
	}
	
	@Override
	public Patient getByLastName(String patientLastName) {
		// TODO Auto-generated method stub
		return patientInterfaceRepo.findByLastname(patientLastName);
	}

	@Override
	public Patient getByMobilenumber(long mobilenumber) {
		// TODO Auto-generated method stub
		return patientInterfaceRepo.findByMobilenumber(mobilenumber);
	}

}
