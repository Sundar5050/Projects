package com.org.cb.dao;

import java.util.List;

import com.org.cb.model.Employee;

public interface EmployeeDAO {
	
	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployee();
	
	void deleteEmployeeBySsn(String ssn);
	
	Employee findBySsn(String ssn);
	
	void updateEmployee(Employee employee);

}
