package com.org.cb.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.org.cb.dao.BillingMaster;

@Repository
public class BillingMasterImpl extends AbstractDaoImpl implements BillingMaster{

	@Override
	public void insertBillingMaster(BillingMaster billingMaster) {
		persists(billingMaster);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BillingMaster> findAllEmployee() {
		Criteria criteria = getSession().createCriteria(getClass());
		return (List<BillingMaster>) criteria.list();
	}

}
