package com.eclinic.db.query;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.Doctor;
import com.eclinic.db.model.Specialization;

public class DoctorQuery {

	private DBDao<Doctor> doctorDao;
	
	public List<Doctor> findByName(String name){
		Doctor d = new Doctor();
		d.setName(name);
		return doctorDao.findByExample(d, Doctor.class);
	}
	
	public List<Doctor> findBySurname(String surname){
		Doctor d = new Doctor();
		d.setSurname(surname);
		return doctorDao.findByExample(d, Doctor.class);
	}
	
	public List<Doctor> findBySpecialization(String specilization){
		Doctor d = new Doctor();
		Specialization s = new Specialization();
		s.setName(specilization);
		Set<Specialization> sp = new HashSet<Specialization>();
		d.setSpecializations(sp);
		return doctorDao.findByExample(d, Doctor.class);
		
	}
	
	public List<Doctor> findByExample(Doctor doctor){
		return doctorDao.findByExample(doctor, Doctor.class);
		
	}
	public boolean addDoctor(Doctor d){
		return doctorDao.add(d, Doctor.class.getName());
	}

	public DBDao<Doctor> getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(DBDao<Doctor> doctorDao) {
		this.doctorDao = doctorDao;
	}
	
}
