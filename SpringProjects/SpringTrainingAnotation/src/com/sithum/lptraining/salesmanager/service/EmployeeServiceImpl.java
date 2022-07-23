package com.sithum.lptraining.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sithum.lptraining.salesmanager.model.Employee;
import com.sithum.lptraining.salesmanager.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		System.out.println("default constructor executed");
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("overloaded constructor executed");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter injection fired");
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
