package com.eclinic.db.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class User implements UserDetails
{


	private String name;

	private String password;

	private Set<String> roles = new HashSet<String>();


	public User()
	{
	}


	public User(String name, String passwordHash)
	{
		this.name = name;
		this.password = passwordHash;
	}




	public String getName()
	{
		return this.name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public Set<String> getRoles()
	{
		return this.roles;
	}


	public void setRoles(Set<String> roles)
	{
		this.roles = roles;
	}


	public void addRole(String role)
	{
		this.roles.add(role);
	}


	public String getPassword()
	{
		return this.password;
	}


	public void setPassword(String password)
	{
		this.password = password;
	}


	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		Set<String> roles = this.getRoles();

		if (roles == null) {
			return Collections.emptyList();
		}

		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}

		return authorities;
	}


	public String getUsername()
	{
		return this.name;
	}


	public boolean isAccountNonExpired()
	{
		return true;
	}


	public boolean isAccountNonLocked()
	{
		return true;
	}


	public boolean isCredentialsNonExpired()
	{
		return true;
	}


	public boolean isEnabled()
	{
		return true;
	}

}