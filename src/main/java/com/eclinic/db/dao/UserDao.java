package com.eclinic.db.dao;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.eclinic.db.model.SystemUser;


public class UserDao extends DBDao<SystemUser> implements UserDetailsService
{

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		SystemUser u = new SystemUser();
		u.setLogin(username);
		return findByExample(u, SystemUser.class).get(0);
	}


}