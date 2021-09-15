package com.htc.patientmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htc.patientmanagement.entity.Patient;
import com.htc.patientmanagement.service.PatientServiceInterface;


@RestController
public class PatientController {

	@Autowired
	private PatientServiceInterface patientServiceInterface;
	
	@GetMapping("api/patients/{patientId}") 
	public Patient getPatient(@PathVariable long patientId) {
	
		return patientServiceInterface.getPatientById(patientId);
		
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
	
	@GetMapping("/patients/FirstName/{firstname}")
	public Patient getByFirstName(@PathVariable String firstname) {
		return patientServiceInterface.getByFirstName(firstname);
	}
	
	@GetMapping("/patients/LastName/{lastname}")
	public Patient getByLastName(@PathVariable String lastname) {
		return patientServiceInterface.getByLastName(lastname);
	}
	
	@GetMapping("/patients/MobileNumber/{mobilenumber}")
	public Patient getByMobileNumber(@PathVariable long mobilenumber) {
		return patientServiceInterface.getByMobilenumber(mobilenumber);
	}
	
	
}
