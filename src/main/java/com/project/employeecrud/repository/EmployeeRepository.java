package com.project.employeecrud.repository;

import com.project.employeecrud.dto.EmployeeDto;
import com.project.employeecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeDto, Integer>{



}
