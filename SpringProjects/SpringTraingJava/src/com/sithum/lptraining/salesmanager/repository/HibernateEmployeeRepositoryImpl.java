package com.sithum.lptraining.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.sithum.lptraining.salesmanager.model.Employee;
import org.springframework.stereotype.Repository;

@Repository("sithum")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public List<Employee> getAllEmployees(){
		
List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("sithum");
		employee.setEmployeeLocation("Beruwala");
		employees.add(employee);
		return employees;
		
		
	}
}
