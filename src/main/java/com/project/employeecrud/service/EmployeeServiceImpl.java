package com.project.employeecrud.service;

import com.project.employeecrud.dto.EmployeeDto;
import com.project.employeecrud.model.Employee;
import com.project.employeecrud.repository.EmployeeRepository;
import com.project.employeecrud.service.employeeCalc.EmployeeCalculations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    private EmployeeCalculations employeeCalculations;

    @Autowired
    public EmployeeServiceImpl(EmployeeCalculations employeeCalculations) {
        this.employeeCalculations = employeeCalculations;
    }

    @Override
    public String addEmployee(Employee employee) {
        EmployeeDto save = employeeRepository.save(createEmployeeUser(employee));
        return save.getUserName();
    }


    public EmployeeDto createEmployeeUser(Employee employee){
        return EmployeeDto.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .address(employee.getAddress())
                .email(employee.getEmail())
                .phoneNumber(employee.getPhoneNumber())
                .userName(employeeCalculations.createUserName(employee))
                .password(employeeCalculations.generatePass(employee))
                .build();
    }

    @Override
    public List<EmployeeDto> getEmployee(Employee employee) {
        List<EmployeeDto> employeeRepositoryAll = employeeRepository.findAll();
        return employeeRepositoryAll;
    }



}
