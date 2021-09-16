package com.htc.hospitalaggregate.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.hospitalaggregate.entity.Hospital;
import com.htc.hospitalaggregate.entity.Patient;


@Component
@FeignClient(url = "http://localhost:4804",name="patient-management")
public interface PatientServices {

	@GetMapping("api/patients/{patientId}") 
	public Patient getPatient(@PathVariable long patientId);
}
