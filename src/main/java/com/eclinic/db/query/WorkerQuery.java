package com.eclinic.db.query;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.Worker;

public class WorkerQuery {

private DBDao<Worker> workerDao;
	
	public boolean addWorker(Worker d){
		return workerDao.add(d, Worker.class.getName());
	}

	public DBDao<Worker> getWorkerDao() {
		return workerDao;
	}

	public void setWorkerDao(DBDao<Worker> workerDao) {
		this.workerDao = workerDao;
	}
}
