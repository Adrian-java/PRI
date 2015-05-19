package com.eclinic.db.query;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.Admin;

public class AdminQuery {

private DBDao<Admin> adminDao;
	
	public boolean addAdmin(Admin d){
		return adminDao.save(d, Admin.class.getName());
	}

	public DBDao<Admin> getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(DBDao<Admin> adminDao) {
		this.adminDao = adminDao;
	}

}
