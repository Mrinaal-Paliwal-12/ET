package com.java.service;

import com.java.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

	public Employee getEmployee() throws EmployeeServiceException {
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

	public Employee getEmployeeNull() throws EmployeeServiceException {

		return null;
	}

	public Employee getEmployeeException() throws EmployeeServiceException {

		throw new EmployeeServiceException();
	}
	
	public List<Employee> getEmployee1() throws EmployeeServiceException {

		List<Employee> list = new ArrayList<>();
		
		Employee emp = new Employee();
		emp.setName("Employee1");
		emp.setDesignation("Manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		list.add(emp);
		
		emp = new Employee();
		emp.setName("Employee2");
		emp.setDesignation("Manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		list.add(emp);
		return list;
	}

}
