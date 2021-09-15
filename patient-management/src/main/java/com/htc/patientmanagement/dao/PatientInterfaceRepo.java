package com.htc.patientmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htc.patientmanagement.entity.Patient;
@Repository
public interface PatientInterfaceRepo extends JpaRepository<Patient,Long>{

	@Query(value="SELECT patient_id,first_name,last_name,mobile_number,disease FROM patient WHERE first_name=?1",nativeQuery = true)
	public Patient findByFirstname(String patientFirstName);
	
	@Query(value="SELECT patient_id,first_name,last_name,mobile_number,disease FROM patient WHERE last_name=?1",nativeQuery = true)
	public Patient findByLastname(String patientLastname);
	
	@Query(value="SELECT patient_id,first_name,last_name,mobile_number,disease FROM patient WHERE mobile_number=?1",nativeQuery = true)
	public Patient findByMobilenumber(Long mobileNumber);
}
