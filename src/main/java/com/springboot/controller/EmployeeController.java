package com.springboot.controller;

import com.springboot.domain.Employee;
import com.springboot.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("api/v1/employee"))
@Slf4j
public class EmployeeController {

  private final EmployeeService employeeService;

  @Autowired
  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping("/{id}")
  public Employee employee(@PathVariable("id") Long id) {
    return employeeService.getEmployee(id);
  }

  @GetMapping
  public List<Employee> employees() {
    return employeeService.getEmployees();
  }
}
