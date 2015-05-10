package com.eclinic.db.model;

// Generated 2015-05-03 18:58:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientCard generated by hbm2java
 */
@Entity
@Table(name = "Patient_Card")
public class PatientCard implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6115031018585066101L;
	private Long id;
	private Patient patient;
	private Doctor doctor;
	private Date registerDate;
	private Set<Visit> visits = new HashSet<Visit>(0);

	public PatientCard() {
	}

	public PatientCard(Patient patient, Doctor doctor, Date registerDate) {
		this.patient = patient;
		this.doctor = doctor;
		this.registerDate = registerDate;
	}

	public PatientCard(Patient patient, Doctor doctor, Date registerDate,
			Set<Visit> visits) {
		this.patient = patient;
		this.doctor = doctor;
		this.registerDate = registerDate;
		this.visits = visits;
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
	@JoinColumn(name = "id_patient", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_default_doctor", nullable = false)
	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "register_date", nullable = false, length = 10)
	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientCard")
	public Set<Visit> getVisits() {
		return this.visits;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

}
