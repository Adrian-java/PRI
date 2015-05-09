package com.eclinic.db.model;

// Generated 2015-05-03 18:58:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SystemError generated by hbm2java
 */
@Entity
@Table(name = "System_Error", catalog = "eclinic")
public class SystemError implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8364294452995566326L;
	private Long id;
	private Date date;
	private byte[] generatedErrorDescription;
	private byte[] fixed;

	public SystemError() {
	}

	public SystemError(Date date, byte[] generatedErrorDescription, byte[] fixed) {
		this.date = date;
		this.generatedErrorDescription = generatedErrorDescription;
		this.fixed = fixed;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "generated_error_description", nullable = false)
	public byte[] getGeneratedErrorDescription() {
		return this.generatedErrorDescription;
	}

	public void setGeneratedErrorDescription(byte[] generatedErrorDescription) {
		this.generatedErrorDescription = generatedErrorDescription;
	}

	@Column(name = "fixed", nullable = false)
	public byte[] getFixed() {
		return this.fixed;
	}

	public void setFixed(byte[] fixed) {
		this.fixed = fixed;
	}

}