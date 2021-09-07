package com.htc.patientmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.patientmanagement.entity.Patient;
import com.htc.patientmanagement.service.PatientServiceInterface;


@RestController
public class PatientController {

	@Autowired
	private PatientServiceInterface patientServiceInterface;
	
	@GetMapping("/patients/{id}") 
	public Patient getPatient(@PathVariable Long id) {
		
		Patient patient =patientServiceInterface.getPatientById(id);
		return patient;
		
	}
	
	@PostMapping("/patients") 
	public boolean addPatient(@RequestBody Patient patient) {
		
		 return patientServiceInterface.addPatient(patient);
	}
	
	@PutMapping("/patients/{id}") 
	public boolean updatePatient(@PathVariable Long id, String disease) {
		return patientServiceInterface.updatePatient(id,disease);
	}
	
	@DeleteMapping("/patients/{id}")
	public boolean deletePatient(@PathVariable Long id) {
		return patientServiceInterface.deletepatient(id);
	}
	
	@GetMapping("/patients")
	public List<Patient> displayAllPatients(){
		
		return patientServiceInterface.getAllPatients();
	}
}
