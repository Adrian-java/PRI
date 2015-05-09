package com.eclinic.db.query;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.Address;

public class AddressQuery {

	private DBDao<Address> addressDao;

	public boolean addAddress(Address d) {
		return addressDao.add(d, Address.class.getName());
	}

	public DBDao<Address> getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(DBDao<Address> addressDao) {
		this.addressDao = addressDao;
	}

}
