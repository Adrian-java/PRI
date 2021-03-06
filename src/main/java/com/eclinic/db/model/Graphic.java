package com.eclinic.db.model;

// Generated 2015-05-03 18:58:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Graphic generated by hbm2java
 */
@Entity
@Table(name = "Graphic")
public class Graphic implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Doctor doctor;
	private byte[] absence;
	private Date day;

	public Graphic() {
	}

	public Graphic(Doctor doctor, Date day) {
		this.doctor = doctor;
		this.day = day;
	}

	public Graphic(Doctor doctor, byte[] absence, Date day) {
		this.doctor = doctor;
		this.absence = absence;
		this.day = day;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_doctor", nullable = false)
	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Column(name = "absence")
	public byte[] getAbsence() {
		return this.absence;
	}

	public void setAbsence(byte[] absence) {
		this.absence = absence;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "day", nullable = false, length = 10)
	public Date getDay() {
		return this.day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

}
