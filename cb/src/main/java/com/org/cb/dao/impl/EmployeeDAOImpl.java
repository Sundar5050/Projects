package com.org.cb.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.org.cb.dao.EmployeeDAO;
import com.org.cb.model.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl extends AbstractDaoImpl implements EmployeeDAO {

	@Override
	public void saveEmployee(Employee employee) {
		persists(employee);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployee() {
		Criteria criteria = getSession().createCriteria(Employee.class);
				return (List<Employee>) criteria.list();
	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from employee where ssn = :ssn").setParameter("ssn",ssn);
		query.executeUpdate();
		
	}

	@Override
	public Employee findBySsn(String ssn) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("ssn", ssn));
		return(Employee) criteria.uniqueResult();
	}

	@Override
	public void updateEmployee(Employee employee) {
		getSession().update(employee);
		
	}

}
