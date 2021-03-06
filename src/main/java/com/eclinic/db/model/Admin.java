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
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "Admin")
public class Admin implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private boolean isSuper;
	private Set<Worker> workers = new HashSet<Worker>(0);

	public Admin() {
	}

	public Admin(boolean isSuper) {
		this.isSuper = isSuper;
	}

	public Admin(boolean isSuper, Set<Worker> workers) {
		this.isSuper = isSuper;
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

	@Column(name = "is_super", nullable = false)
	public boolean isIsSuper() {
		return this.isSuper;
	}

	public void setIsSuper(boolean isSuper) {
		this.isSuper = isSuper;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admin")
	public Set<Worker> getWorkers() {
		return this.workers;
	}

	public void setWorkers(Set<Worker> workers) {
		this.workers = workers;
	}

}
