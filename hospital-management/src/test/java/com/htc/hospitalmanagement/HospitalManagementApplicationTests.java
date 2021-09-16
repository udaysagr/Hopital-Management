package com.htc.hospitalmanagement;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;


import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.htc.hospitalmanagement.dao.AppointmentInterface;
import com.htc.hospitalmanagement.entity.Appointment;

@SpringBootTest
class HospitalManagementApplicationTests {

	@Test
	void contextLoads() {
	}
	

	@Autowired
	AppointmentInterface appointInterface;
	
	@BeforeEach
	public void beforeTest() {
		System.out.println("Before Testing");
	}
	
	@Test
	public void isAppointmentStoredTest() {
		Appointment appointment=new Appointment(1,LocalDateTime.of(2020, 05, 8, 04, 30));
		appointInterface.save(appointment);
		assertEquals(appointment,appointInterface.findById(1L).get());
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("After Testing");
	}
}
