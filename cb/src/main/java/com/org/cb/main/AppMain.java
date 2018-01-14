package com.org.cb.main;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.cb.common.CBStandardKeys;
import com.org.cb.framework.impl.FileConvertImpl;
import com.org.cb.framework.impl.FileHandlingImpl;
import com.org.cb.framework.impl.FileInitializeImpl;
import com.org.cb.model.Employee;
import com.org.cb.service.EmployeeService;

public class AppMain {

	public static void main(String[] args) throws ParseException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		FileHandlingImpl beanHandle =  (FileHandlingImpl) context.getBean("FileHandle");
	
		beanHandle.FileHandling();
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
         // Create Employee1
         
        Employee employee1 = new Employee();
        employee1.setName("Han Yenn");
        employee1.setJoiningDate(sdf.parse("2018-01-02"));
        employee1.setSalary(new Double(10000));
        employee1.setSsn("ssn00000001");
 
        
         // Create Employee2
         
        Employee employee2 = new Employee();
        employee2.setName("Dan Thomas");
        employee2.setJoiningDate(sdf.parse("2018-01-02"));
        employee2.setSalary(new Double(20000));
        employee2.setSsn("ssn00000002");
 
        
         // Persist both Employees
         
        service.saveEmployee(employee1);
        service.saveEmployee(employee2);
 
        
         // Get all employees list from database
         
        List<Employee> employees = service.findAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }
 
        
         // delete an employee
         
        service.deleteEmployeeBySsn("ssn00000002");
 
        
         // update an employee
         
 
        Employee employee = service.findBySsn("ssn00000001");
        employee.setSalary(new Double(50000));
        service.updateEmployee(employee);
 
        
         // Get all employees list from database
         
        List<Employee> employeeList = service.findAllEmployees();
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
 
       context.close();
		
	}

}
