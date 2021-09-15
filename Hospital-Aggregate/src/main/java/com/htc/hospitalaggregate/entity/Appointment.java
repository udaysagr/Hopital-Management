package com.htc.hospitalaggregate.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4290433460427598981L;
	
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
		return Objects.hash(appointmentId);
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
		return appointmentId == other.appointmentId;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDate_Time=" + appointmentDate_Time + "]";
	}
	
}
