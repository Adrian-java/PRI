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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Specialization generated by hbm2java
 */
@Entity
@Table(name = "Specialization", catalog = "eclinic")
public class Specialization implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -924514260591710725L;
	private Long id;
	private Doctor doctor;
	private String name;
	private byte[] description;
	private Set<SpecalVisitField> specalVisitFields = new HashSet<SpecalVisitField>(0);
	private Set<VisitScheduler> visitSchedulers = new HashSet<VisitScheduler>(0);

	public Specialization() {
	}

	public Specialization(Doctor doctor, String name) {
		this.doctor = doctor;
		this.name = name;
	}

	public Specialization(Doctor doctor, String name, byte[] description,
			Set<SpecalVisitField> specalVisitFields, Set<VisitScheduler> visitSchedulers) {
		this.doctor = doctor;
		this.name = name;
		this.description = description;
		this.specalVisitFields = specalVisitFields;
		this.visitSchedulers = visitSchedulers;
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

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public byte[] getDescription() {
		return this.description;
	}

	public void setDescription(byte[] description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "specialization")
	public Set<SpecalVisitField> getSpecalVisitFields() {
		return this.specalVisitFields;
	}

	public void setSpecalVisitFields(Set<SpecalVisitField> specalVisitFields) {
		this.specalVisitFields = specalVisitFields;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "specialization")
	public Set<VisitScheduler> getVisitSchedulers() {
		return this.visitSchedulers;
	}

	public void setVisitSchedulers(Set<VisitScheduler> visitSchedulers) {
		this.visitSchedulers = visitSchedulers;
	}

}
