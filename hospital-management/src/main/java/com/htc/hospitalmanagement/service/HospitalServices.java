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
	public ResponseEntity<Object> insert(Hospital hospital) {
		Hospital hospitalInput = new Hospital();

		hospitalInput.setDoctorId(hospital.getDoctorId());
		hospitalInput.setDoctorName(hospital.getDoctorName());
		hospitalInput.setDepartment(hospital.getDepartment());
		hospitalInput.setAppointment(hospital.getAppointment());

		Hospital insertedInfo = hospitalInterface.save(hospitalInput);
		return ResponseEntity.accepted().body(insertedInfo);
	}
	

}
