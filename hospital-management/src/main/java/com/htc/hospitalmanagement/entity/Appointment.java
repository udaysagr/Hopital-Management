package com.htc.hospitalmanagement.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5153314931240654691L;
	
	@Id
	private long appointmentId;
	private LocalDateTime appointmentDate_Time;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(long appointmentId, LocalDateTime appointmentDate_Time) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate_Time = appointmentDate_Time;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public LocalDateTime getAppointmentDate_Time() {
		return appointmentDate_Time;
	}
	public void setAppointmentDate_Time(LocalDateTime appointmentDate_Time) {
		this.appointmentDate_Time = appointmentDate_Time;
	}
	@Override
	public int hashCode() {
		return Objects.hash(appointmentDate_Time, appointmentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(appointmentDate_Time, other.appointmentDate_Time) && appointmentId == other.appointmentId;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDate_Time=" + appointmentDate_Time + "]";
	}
	
	
}
