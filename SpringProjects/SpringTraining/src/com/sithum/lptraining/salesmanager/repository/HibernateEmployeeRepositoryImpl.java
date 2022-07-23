package com.sithum.lptraining.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.sithum.lptraining.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public List<Employee> getAllEmployees(){
		
List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Ashfak");
		employee.setEmployeeLocation("Beruwala");
		employees.add(employee);
		return employees;
		
		
	}
}
