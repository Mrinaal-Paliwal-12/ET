package com.java.controller;

import com.java.exceptionhandling.MultipleResourceFound;
import com.java.exceptionhandling.ResourceNotFoundException;
import com.java.model.Employee;
import com.java.service.EmployeeService;
import com.java.service.EmployeeServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee getEmployee() throws ResourceNotFoundException, EmployeeServiceException {

		Employee emp = employeeService.getEmployee();

		if (emp == null) {
			throw new ResourceNotFoundException("Employee not found");
		}
		return emp;
	}

	@RequestMapping(value = "/employee1", method = RequestMethod.GET)
	public Employee getEmployee2() throws ResourceNotFoundException, EmployeeServiceException {

		Employee emp = employeeService.getEmployeeNull();
		if (emp == null) {
			throw new ResourceNotFoundException("Employee not found");
		}

		return emp;
	}

	@RequestMapping(value = "/employee2", method = RequestMethod.GET)
	public Employee getEmployee3() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee emp = employeeService.getEmployeeException();
			if (emp == null) {
				throw new ResourceNotFoundException("Employee not found");
			}
			return emp;
		} catch (EmployeeServiceException e) {
			throw new EmployeeServiceException("Internal Server Exception while getting exception");
		}
	}
	
	@RequestMapping(value = "/employee3", method = RequestMethod.GET)
	public List<Employee> getEmployee1() throws ResourceNotFoundException, EmployeeServiceException, MultipleResourceFound {

		List<Employee> empList = employeeService.getEmployee1();
		if (empList.size()>1) {
			throw new MultipleResourceFound("Multiple resource found with same name");
		}

		return empList;
	}
}
