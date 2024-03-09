package com.springboot.services;

import com.springboot.domain.Employee;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

  private Employee emp1= new Employee(1L, "Rohit", "IT");
  private Employee emp2 = new Employee(2L, "Ankit", "Finance");
  private Employee emp3 = new Employee(3L, "Neha", "HR");
  private List<Employee> emps = List.of(emp1, emp2, emp3);

  public Employee getEmployee(Long id) {
    Employee employee = emps.stream().filter(x -> x.getId().equals(id)).findFirst().orElseThrow();
    return employee;
  }

  public List<Employee> getEmployees() {
    return emps;
  }


}
