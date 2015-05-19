package com.eclinic.db.query;

import java.util.Date;
import java.util.List;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.Patient;

public class PatientQuery {

	private DBDao<Patient> patientDao;
	
	public List<Patient> findByName(String name){
		Patient p = new Patient();
		p.setName(name);
		return patientDao.findByExample(p, Patient.class);
	}
	
	public List<Patient> SurName(String surName){
		Patient p = new Patient();
		p.setSurname(surName);
		return patientDao.findByExample(p, Patient.class);
	}
	
	public List<Patient> findByPesel(String pesel){
		Patient p = new Patient();
		p.setPesel(pesel);
		return patientDao.findByExample(p, Patient.class);
	}
	
	public List<Patient> findByDateOfBirth(Date date){
		Patient p = new Patient();
		p.setDateOfBirth(date);
		return patientDao.findByExample(p, Patient.class);
	}
	
	public Boolean addPatient(Patient p){
		return patientDao.save(p, Patient.class.getName());
	}

	public DBDao<Patient> getPatientDao() {
		return patientDao;
	}

	public void setPatientDao(DBDao<Patient> patientDao) {
		this.patientDao = patientDao;
	}
}
