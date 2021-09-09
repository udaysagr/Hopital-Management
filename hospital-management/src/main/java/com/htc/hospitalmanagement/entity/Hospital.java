package com.htc.hospitalmanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="HOSPITAL")
public class Hospital implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1556626358948348787L;
	@Id
	private long doctorId;
	private String doctorName;
	private String department;
	
	@OneToMany(targetEntity = Appointment.class,cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Appointment> appointment;
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(long doctorId, String doctorName, String department) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
	}



	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
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

	@Override
	public int hashCode() {
		return Objects.hash(doctorId);
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
		return doctorId == other.doctorId;
	}

	@Override
	public String toString() {
		return "Hospital [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department + "]";
	}
	
}
