package com.sithum.lptraining.salesmanager.service;

import java.util.List;

import com.sithum.lptraining.salesmanager.model.Employee;
import org.springframework.stereotype.Service;

@Service("employeeService")
public interface EmployeeService {

	List<Employee> getAllEmployees();

}
