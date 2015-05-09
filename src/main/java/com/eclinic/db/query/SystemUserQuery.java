package com.eclinic.db.query;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.SystemUser;

public class SystemUserQuery {

	private DBDao<SystemUser> userDao;
	
	private PasswordEncoder passwordEncoder;

	public SystemUser getUserByName(String name) {
		SystemUser instance = new SystemUser();
		instance.setLogin(name);
		return userDao.findByExample(instance, SystemUser.class).get(0);
	}

	public boolean addUser(SystemUser su) {
		su.setPassword(this.passwordEncoder.encode(su.getPassword()));
		return userDao.add(su, SystemUser.class.getName());
	}

	public DBDao<SystemUser> getUserDao() {
		return userDao;
	}

	public void setUserDao(DBDao<SystemUser> userDao) {
		this.userDao = userDao;
	}

	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
}
