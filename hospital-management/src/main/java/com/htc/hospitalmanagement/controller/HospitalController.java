package com.htc.hospitalmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.hospitalmanagement.dao.HospitalInterface;
import com.htc.hospitalmanagement.entity.Hospital;
import com.htc.hospitalmanagement.service.HospitalServices;
@RestController
public class HospitalController {
	@Autowired
	private HospitalInterface hospitalInterface;
	
	@Autowired
	private HospitalServices hospitalServices;


	@PostMapping("/hospital")
	public Hospital insertInfo(@RequestBody Hospital hospital)
	{
		return hospitalServices.insert(hospital);
		
	}
	
	 @GetMapping("/hospital")
	  public List<Hospital> getAllInfo() {
	   
	    List<Hospital> hospitallist = hospitalInterface.findAll();
	    return hospitallist;
	  }
	 
	 @GetMapping("/hospital/{appointmentId}")
		public Hospital getByappointmentId(@PathVariable Long appointmentId)
		{
			Hospital doctor=null;
			doctor=hospitalInterface.findById(appointmentId).get();
			return doctor;
			
		}
		
		@PutMapping("/hospital/{appointmentId}")
		public Hospital updateDoctor(@RequestBody Hospital changes, @PathVariable long appointmentId) {
			return hospitalInterface.findById(appointmentId)
					.map(doctor ->{
						doctor.setDoctorName(changes.getDoctorName());
						doctor.setDoctorId(changes.getDoctorId());
						return hospitalInterface.save(doctor);
					})
					.orElseGet(() -> {
						changes.setDoctorId(changes.getDoctorId());
				     return hospitalInterface.save(changes);
				      });
		}
		
		@DeleteMapping("/hospital/{appointmentId}")
		 public void deleteDoctor(@PathVariable long appointmentId) {
			hospitalInterface.deleteById(appointmentId);
		  }
		
	
}
