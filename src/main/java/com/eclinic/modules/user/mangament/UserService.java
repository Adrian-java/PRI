package com.eclinic.modules.user.mangament;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.eclinic.db.model.SystemUser;
import com.eclinic.db.model.User;
import com.eclinic.db.query.AddressQuery;
import com.eclinic.db.query.AdminQuery;
import com.eclinic.db.query.DoctorQuery;
import com.eclinic.db.query.PatientQuery;
import com.eclinic.db.query.SystemUserQuery;
import com.eclinic.db.query.WorkerQuery;

public class UserService implements UserDetailsService {

	private SystemUserQuery systemUserQuery;
	private DoctorQuery doctorQuery;
	private WorkerQuery workerQuery;
	private AdminQuery adminQuery;
	private PatientQuery patientQuery;
	private PasswordEncoder passwordEncoder;
	private AddressQuery addressQuery;

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		SystemUser su = systemUserQuery.getUserByName(username);
		return su;
	}

	public boolean addAdmin(SystemUser systemUser) {
		adminQuery.addAdmin(systemUser.getWorker().getAdmin());
		workerQuery.addWorker(systemUser.getWorker());
		return systemUserQuery.addUser(systemUser);
	}

	public boolean addDoctor(SystemUser systemUser) {
		doctorQuery.addDoctor(systemUser.getWorker().getDoctor());
		workerQuery.addWorker(systemUser.getWorker());
		return systemUserQuery.addUser(systemUser);
	}

	public boolean addPatient(SystemUser systemUser) {
		addressQuery.addAddress(systemUser.getWorker().getPatient()
				.getAddress());
		patientQuery.addPatient(systemUser.getWorker().getPatient());
		workerQuery.addWorker(systemUser.getWorker());
		return systemUserQuery.addUser(systemUser);
	}
	
	

	public SystemUserQuery getSystemUserQuery() {
		return systemUserQuery;
	}

	public void setSystemUserQuery(SystemUserQuery systemUserQuery) {
		this.systemUserQuery = systemUserQuery;
	}

	public DoctorQuery getDoctorQuery() {
		return doctorQuery;
	}

	public void setDoctorQuery(DoctorQuery doctorQuery) {
		this.doctorQuery = doctorQuery;
	}

	public WorkerQuery getWorkerQuery() {
		return workerQuery;
	}

	public void setWorkerQuery(WorkerQuery workerQuery) {
		this.workerQuery = workerQuery;
	}

	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public AdminQuery getAdminQuery() {
		return adminQuery;
	}

	public void setAdminQuery(AdminQuery adminQuery) {
		this.adminQuery = adminQuery;
	}

	public PatientQuery getPatientQuery() {
		return patientQuery;
	}

	public void setPatientQuery(PatientQuery patientQuery) {
		this.patientQuery = patientQuery;
	}

	public AddressQuery getAddressQuery() {
		return addressQuery;
	}

	public void setAddressQuery(AddressQuery addressQuery) {
		this.addressQuery = addressQuery;
	}

}
