package com.htc.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.hospitalmanagement.entity.Hospital;

public interface HospitalInterface extends JpaRepository<Hospital, Long>{

}
