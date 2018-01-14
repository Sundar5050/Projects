package com.org.cb.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.cb.dao.AbstractDao;

public class AbstractDaoImpl implements AbstractDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	public AbstractDaoImpl() {
		super();
		System.out.println("Inside AbstractDAO constructor.");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void persists(Object entity) {
		getSession().persist(entity);
		
	}

	@Override
	public void delete(Object entity) {
		getSession().delete(entity);
		
	}

}
