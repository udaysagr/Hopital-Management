package com.htc.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.hospitalmanagement.entity.Appointment;

public interface AppointmentInterface extends JpaRepository<Appointment, Long> {

}
