package com.htc.hospitalmanagement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.htc.hospitalmanagement.dao.AppointmentInterface;

public class AppointmentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class Test");
	}

	@Autowired
	AppointmentInterface appointInterface;
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class Test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Each Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Each Test");
	}

	@Test
	public void isAppointmentInsertedtest() {
		//fail("Not yet implemented"); // TODO
		
	}

}
