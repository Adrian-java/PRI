package com.eclinic.db.model;

// Generated 2015-05-03 18:58:02 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Worker generated by hbm2java
 */
@Entity
@Table(name = "Worker")
public class Worker implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Patient patient;
	private Admin admin;
	private Receptionist receptionist;
	private Doctor doctor;
	private Set<LoginHistory> loginHistories = new HashSet<LoginHistory>(0);
	private Set<SystemUser> systemUsers = new HashSet<SystemUser>(0);

	public Worker() {
	}

	public Worker(Patient patient, Admin admin, Receptionist receptionist,
			Doctor doctor, Set<LoginHistory> loginHistories, Set<SystemUser> systemUsers) {
		this.patient = patient;
		this.admin = admin;
		this.receptionist = receptionist;
		this.doctor = doctor;
		this.loginHistories = loginHistories;
		this.systemUsers = systemUsers;
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

	@ManyToOne(fetch = FetchType.EAGER,  cascade={CascadeType.ALL})
	@JoinColumn(name = "id_patient")
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_admin")
	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_recepcionist")
	public Receptionist getReceptionist() {
		return this.receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_doctor")
	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "worker")
	public Set<LoginHistory> getLoginHistories() {
		return this.loginHistories;
	}

	public void setLoginHistories(Set<LoginHistory> loginHistories) {
		this.loginHistories = loginHistories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "worker")
	public Set<SystemUser> getSystemUsers() {
		return this.systemUsers;
	}

	public void setSystemUsers(Set<SystemUser> systemUsers) {
		this.systemUsers = systemUsers;
	}

}
