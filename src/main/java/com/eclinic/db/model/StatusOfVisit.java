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
 * StatusOfVisit generated by hbm2java
 */
@Entity
@Table(name = "Status_Of_Visit")
public class StatusOfVisit implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6298898191610404866L;
	private Long id;
	private String type;
	private Set<Visit> visits = new HashSet<Visit>(0);

	public StatusOfVisit() {
	}

	public StatusOfVisit(String type) {
		this.type = type;
	}

	public StatusOfVisit(String type, Set<Visit> visits) {
		this.type = type;
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

	@Column(name = "type", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusOfVisit")
	public Set<Visit> getVisits() {
		return this.visits;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

}
