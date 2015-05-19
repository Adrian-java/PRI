package com.eclinic.db.query;

import java.util.Date;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.SystemUser;

public class SystemUserQuery {

	private DBDao<SystemUser> userDao;
	
	private PasswordEncoder passwordEncoder;

	public SystemUser getUserByName(String name) {
		SystemUser instance = new SystemUser();
		instance.setLogin(name);
		try{
		return userDao.findByExample(instance, SystemUser.class).get(0);
		} catch(Exception e){
			return null;
		}
	}

	public boolean addUser(SystemUser su) {
		su.setPassword(this.passwordEncoder.encode(su.getPassword()));
		return userDao.save(su, SystemUser.class.getName());
	}
	public boolean deleteUser(int id) {
		SystemUser su = new SystemUser();
		su.setId((long) id);
		try{
		SystemUser s =  userDao.findByExample(su, SystemUser.class).get(0);
		s.setIsActive(false);
		s.setUnregisterDate(new Date());
		return userDao.save(s, SystemUser.class.getName());
		}
		catch(Exception e){
			return false;
		}
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
