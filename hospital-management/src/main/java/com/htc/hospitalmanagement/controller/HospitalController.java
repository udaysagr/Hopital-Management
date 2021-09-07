package com.htc.hospitalmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.htc.hospitalmanagement.dao.HospitalInterface;
import com.htc.hospitalmanagement.entity.Hospital;

public class HospitalController {
	
	private HospitalInterface hospitalInterface;


	@PostMapping("/hospital")
	public Hospital createDoctordetails(@RequestBody Hospital hospital)
	{
		return hospitalInterface.save(hospital);
		
	}
	
	 @GetMapping("/hospital")
	  public List<Hospital> getAllDoctordetails() {
	   
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
		

	
//	@GetMapping("/hospital/{doctorId}")
//	public Hospital getDoctorbyId(@PathVariable long doctorId)
//	{
//		Hospital doctor=null;
//		doctor=hospitalInterface.findById(doctorId).get();
//		return doctor;
//		
//	}
//	
	
}
