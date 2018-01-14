package com.org.cb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.cb.dao.EmployeeDAO;
import com.org.cb.model.Employee;
import com.org.cb.service.EmployeeService;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployee();
	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {
		dao.deleteEmployeeBySsn(ssn);
		
	}

	@Override
	public Employee findBySsn(String ssn) {
		return dao.findBySsn(ssn);
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.updateEmployee(employee);
		
	}

}
