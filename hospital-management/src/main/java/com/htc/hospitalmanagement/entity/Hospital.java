package com.htc.hospitalmanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
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
	private long appointmentId;
	private LocalDate appointmentDate;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(long doctorId, String doctorName, long appointmentId, LocalDate appointmentDate) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
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
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(appointmentId, doctorId);
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
		return appointmentId == other.appointmentId && doctorId == other.doctorId;
	}
	@Override
	public String toString() {
		return "Hospital [doctorId=" + doctorId + ", doctorName=" + doctorName + ", appointmentId=" + appointmentId
				+ ", appointmentDate=" + appointmentDate + "]";
	}
}
