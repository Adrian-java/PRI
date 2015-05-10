package com.eclinic.db.dao;

import java.util.List;

import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DBDao<T> extends HibernateDaoSupport {

	public boolean delete(T persistentInstance) {
		try {
			getSession().delete(persistentInstance);
			return true;
		} catch (RuntimeException re) {
			return false;
		}
	}

	public T merge(T detachedInstance) {
		try {
			@SuppressWarnings("unchecked")
			T result = (T) getSession().merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public T findById(java.lang.Long id, String className) {
		try {
			@SuppressWarnings("unchecked")
			T instance = (T) getSession().get(className, id);
			if (instance == null) {
			} else {
			}
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<T> findByExample(T instance, Class className) {
		try {
			@SuppressWarnings("unchecked")
			List<T> results = getSession().createCriteria(className)
					.add(Example.create(instance)).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<T> findAll(String entity) {
		try {
			@SuppressWarnings("unchecked")
			List<T> results = getSession().createQuery("from "+entity)
					.list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<T> findByQuery(String query) {
		try {
			@SuppressWarnings("unchecked")
			List<T> results = getSession().createQuery(query).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<T> findBySQLQuery(String query) {
		try {
			@SuppressWarnings("unchecked")
			List<T> results = getSession().createSQLQuery(query).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Boolean update(T model) {
		try {
			getSession().update(model);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean add(T model, String entity) {
		try {
			getSession().save(entity, model);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
