package com.htc.hospitalaggregate.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.hospitalaggregate.entity.Hospital;
import com.htc.hospitalaggregate.entity.Patient;

@Component
@FeignClient(url = "http://localhost:4805",name="patient-management")
public interface HospitalServices {
	@GetMapping("/hospitals/{doctorId}")
	public Hospital getBydoctorId(@PathVariable Long doctorId);
}
 