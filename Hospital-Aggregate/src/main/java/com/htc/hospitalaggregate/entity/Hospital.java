package com.htc.hospitalaggregate.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Hospital implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6477212390482106080L;
	
	private long doctorId;
	private String doctorName;
	private String department;
	
	private List<Appointment> appointment;

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(long doctorId, String doctorName, String department, List<Appointment> appointment) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.appointment = appointment;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointment, doctorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		return Objects.equals(appointment, other.appointment) && doctorId == other.doctorId;
	}

	@Override
	public String toString() {
		return "Hospital [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", appointment=" + appointment + "]";
	}
	
}
