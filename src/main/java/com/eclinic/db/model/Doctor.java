package com.eclinic.db.model;

// Generated 2015-05-03 18:58:02 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Doctor generated by hbm2java
 */
@Entity
@Table(name = "Doctor", catalog = "eclinic")
public class Doctor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String surname;
	private Set<Specialization> specializations = new HashSet<Specialization>(0);
	private Set<PatientCard> patientCards = new HashSet<PatientCard>(0);
	private Set<Recipe> recipes = new HashSet<Recipe>(0);
	private Set<Graphic> graphics = new HashSet<Graphic>(0);
	private Set<Visit> visits = new HashSet<Visit>(0);
	private Set<Worker> workers = new HashSet<Worker>(0);
	private Set<VisitScheduler> visitSchedulers = new HashSet<VisitScheduler>(0);
	private Set<SickLeave> sickLeaves = new HashSet<SickLeave>(0);

	public Doctor() {
	}

	public Doctor(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Doctor(String name, String surname, Set<Specialization> specializations,
			Set<PatientCard> patientCards, Set<Recipe> recipes, Set<Graphic> graphics, Set<Visit> visits,
			Set<Worker> workers, Set<VisitScheduler> visitSchedulers, Set<SickLeave> sickLeaves) {
		this.name = name;
		this.surname = surname;
		this.specializations = specializations;
		this.patientCards = patientCards;
		this.recipes = recipes;
		this.graphics = graphics;
		this.visits = visits;
		this.workers = workers;
		this.visitSchedulers = visitSchedulers;
		this.sickLeaves = sickLeaves;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<Specialization> getSpecializations() {
		return this.specializations;
	}

	public void setSpecializations(Set<Specialization> specializations) {
		this.specializations = specializations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<PatientCard> getPatientCards() {
		return this.patientCards;
	}

	public void setPatientCards(Set<PatientCard> patientCards) {
		this.patientCards = patientCards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<Recipe> getRecipes() {
		return this.recipes;
	}

	public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<Graphic> getGraphics() {
		return this.graphics;
	}

	public void setGraphics(Set<Graphic> graphics) {
		this.graphics = graphics;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<Visit> getVisits() {
		return this.visits;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<Worker> getWorkers() {
		return this.workers;
	}

	public void setWorkers(Set<Worker> workers) {
		this.workers = workers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<VisitScheduler> getVisitSchedulers() {
		return this.visitSchedulers;
	}

	public void setVisitSchedulers(Set<VisitScheduler> visitSchedulers) {
		this.visitSchedulers = visitSchedulers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
	public Set<SickLeave> getSickLeaves() {
		return this.sickLeaves;
	}

	public void setSickLeaves(Set<SickLeave> sickLeaves) {
		this.sickLeaves = sickLeaves;
	}

}