package com.sithum.lptraining.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sithum.lptraining.salesmanager.model.Employee;
import com.sithum.lptraining.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

//	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		
		System.out.println("overloaded cosutructor executed");
		this.employeeRepository = employeeRepository;
		
	}
	
	public EmployeeServiceImpl() {
		System.out.println("default cosutructor executed");
		
	}
	
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter executed");
			this.employeeRepository = employeeRepository;
			}
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
