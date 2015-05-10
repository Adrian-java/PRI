package com.eclinic.db.model;

// Generated 2015-05-03 18:58:02 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Receptionist generated by hbm2java
 */
@Entity
@Table(name = "Receptionist")
public class Receptionist implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8832154765428670108L;
	private Long id;
	private String name;
	private String surname;
	private String phoneNr;
	private byte[] access;
	private Set<Visit> visits = new HashSet<Visit>(0);
	private Set<Worker> workers = new HashSet<Worker>(0);

	public Receptionist() {
	}

	public Receptionist(String name, String surname, byte[] access) {
		this.name = name;
		this.surname = surname;
		this.access = access;
	}

	public Receptionist(String name, String surname, String phoneNr,
			byte[] access, Set<Visit> visits, Set<Worker> workers) {
		this.name = name;
		this.surname = surname;
		this.phoneNr = phoneNr;
		this.access = access;
		this.visits = visits;
		this.workers = workers;
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

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "surname", nullable = false, length = 20)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "phone_nr", length = 20)
	public String getPhoneNr() {
		return this.phoneNr;
	}

	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}

	@Column(name = "access", nullable = false)
	public byte[] getAccess() {
		return this.access;
	}

	public void setAccess(byte[] access) {
		this.access = access;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "receptionist")
	public Set<Visit> getVisits() {
		return this.visits;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "receptionist")
	public Set<Worker> getWorkers() {
		return this.workers;
	}

	public void setWorkers(Set<Worker> workers) {
		this.workers = workers;
	}

}
