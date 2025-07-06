package com.cognizant.employee_jpa;

import com.cognizant.employee_jpa.model.Employee;
import com.cognizant.employee_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeJpaApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeJpaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Employee emp = new Employee("Soumyadeep Basu", "R&D", 80000.0);
		employeeService.addEmployee(emp);
	}
}
