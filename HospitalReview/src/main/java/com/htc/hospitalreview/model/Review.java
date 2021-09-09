package com.htc.hospitalreview.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7018350542162241295L;

	private long doctorId;
	
	@Id
	private long reviewId;
	private String author;
	private String subject;
	private String content;
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public int hashCode() {
		return Objects.hash(reviewId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return reviewId == other.reviewId;
	}
	@Override
	public String toString() {
		return "Hospital [doctorId=" + doctorId + ", reviewId=" + reviewId + ", author=" + author + ", subject="
				+ subject + ", content=" + content + "]";
	}
	
	
}
