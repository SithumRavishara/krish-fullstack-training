package com.sithum.lptraining.salesmanager.config;

import com.sithum.lptraining.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sithum.lptraining.salesmanager.service.EmployeeService;

@Configuration
@ComponentScan("com.sithum")
public class ApplicationConfiguration {

	@Bean(name = "employeeService")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
//		employeeServiceImpl.setEmployeeRepository(getEmployeeRepository());
		
		return new EmployeeServiceImpl();
	}
	
//	@Bean(name = "employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}
	
}
