package org.demo.service;

import org.demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
}