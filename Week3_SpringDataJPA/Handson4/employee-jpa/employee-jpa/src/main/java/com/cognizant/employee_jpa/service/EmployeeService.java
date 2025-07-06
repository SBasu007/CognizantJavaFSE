package com.cognizant.employee_jpa.service;

import com.cognizant.employee_jpa.model.Employee;
import com.cognizant.employee_jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
        System.out.println("Saved: " + employee.getId());
    }
}
