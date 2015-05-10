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
 * Permission generated by hbm2java
 */
@Entity
@Table(name = "Permission")
public class Permission implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4480505338479827399L;
	private Long id;
	private SystemUser systemUser;
	private Module module;
	private Boolean display;
	private Boolean edit;
	private Boolean execute;
	private Set<TypeOfUser> typeOfUsers = new HashSet<TypeOfUser>(0);

	public Permission() {
	}

	public Permission(SystemUser systemUser, Module module) {
		this.systemUser = systemUser;
		this.module = module;
	}

	public Permission(SystemUser systemUser, Module module, Boolean display,
			Boolean edit, Boolean execute, Set<TypeOfUser> typeOfUsers) {
		this.systemUser = systemUser;
		this.module = module;
		this.display = display;
		this.edit = edit;
		this.execute = execute;
		this.typeOfUsers = typeOfUsers;
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
	@JoinColumn(name = "id_system_user", nullable = false)
	public SystemUser getSystemUser() {
		return this.systemUser;
	}

	public void setSystemUser(SystemUser systemUser) {
		this.systemUser = systemUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_module", nullable = false)
	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@Column(name = "display")
	public Boolean getDisplay() {
		return this.display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	@Column(name = "edit")
	public Boolean getEdit() {
		return this.edit;
	}

	public void setEdit(Boolean edit) {
		this.edit = edit;
	}

	@Column(name = "execute")
	public Boolean getExecute() {
		return this.execute;
	}

	public void setExecute(Boolean execute) {
		this.execute = execute;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "permission")
	public Set<TypeOfUser> getTypeOfUsers() {
		return this.typeOfUsers;
	}

	public void setTypeOfUsers(Set<TypeOfUser> typeOfUsers) {
		this.typeOfUsers = typeOfUsers;
	}

}
