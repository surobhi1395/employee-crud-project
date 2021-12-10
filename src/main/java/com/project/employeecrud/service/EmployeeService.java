package com.project.employeecrud.service;

import com.project.employeecrud.dto.EmployeeDto;
import com.project.employeecrud.model.Employee;

import java.util.List;

public interface EmployeeService {

   public String addEmployee(Employee employee);

   public List<EmployeeDto> getEmployee(Employee employee);

}
