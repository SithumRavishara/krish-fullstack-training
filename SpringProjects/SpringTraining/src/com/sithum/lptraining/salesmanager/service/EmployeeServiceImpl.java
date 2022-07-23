package com.sithum.lptraining.salesmanager.service;

import java.util.List;

import com.sithum.lptraining.salesmanager.model.Employee;
import com.sithum.lptraining.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
			this.employeeRepository = employeeRepository;
			}
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
