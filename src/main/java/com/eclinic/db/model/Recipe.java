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
 * Recipe generated by hbm2java
 */
@Entity
@Table(name = "Recipe")
public class Recipe implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7454210159642276054L;
	private Long idr;
	private Patient patient;
	private Doctor doctor;
	private Date date;
	private byte[] drug;

	public Recipe() {
	}

	public Recipe(Patient patient, Date date, byte[] drug) {
		this.patient = patient;
		this.date = date;
		this.drug = drug;
	}

	public Recipe(Patient patient, Doctor doctor, Date date, byte[] drug) {
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
		this.drug = drug;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Idr", unique = true, nullable = false)
	public Long getIdr() {
		return this.idr;
	}

	public void setIdr(Long idr) {
		this.idr = idr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_patient", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_doctor")
	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "drug", nullable = false)
	public byte[] getDrug() {
		return this.drug;
	}

	public void setDrug(byte[] drug) {
		this.drug = drug;
	}

}
