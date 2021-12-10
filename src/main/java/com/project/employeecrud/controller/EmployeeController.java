package com.project.employeecrud.controller;

import com.project.employeecrud.dto.EmployeeDto;
import com.project.employeecrud.model.Employee;
import com.project.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<String> addEmployeeDetails(@RequestBody Employee employee){
        String addEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.ok().body(addEmployee);
    }

    @GetMapping("/employee")
    public List<EmployeeDto> getList(Employee employee){
        List<EmployeeDto> employeeServiceEmployee = employeeService.getEmployee(employee);
        return employeeServiceEmployee;
    }

    

}
