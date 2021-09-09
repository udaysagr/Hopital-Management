package com.htc.hospitalmanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.htc.hospitalmanagement.dao.AppointmentInterface;
import com.htc.hospitalmanagement.dao.HospitalInterface;
import com.htc.hospitalmanagement.entity.Hospital;
@Service
public class HospitalServices {

	@Autowired
	private HospitalInterface hospitalInterface;

	@Autowired
	private AppointmentInterface appointmentInterface;

	@Transactional
	public Hospital insert(Hospital hospital) {
		Hospital insertedInfo = hospitalInterface.save(hospital);
		return insertedInfo;
	}
	
	

}
