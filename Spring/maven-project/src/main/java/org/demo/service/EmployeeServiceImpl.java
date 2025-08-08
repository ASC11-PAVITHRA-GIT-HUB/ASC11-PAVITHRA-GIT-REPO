package org.demo.service;

import org.demo.entity.EmployeeEntity;
import org.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements  EmployeeService{
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        System.err.println("Getting All Employees!");
        return employeeRepository.findAll();
    }
}