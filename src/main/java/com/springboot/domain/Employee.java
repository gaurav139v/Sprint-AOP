package com.springboot.domain;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Employee {

  private Long id;
  private String name;
  private String department;
//  private LocalDate dateOfBirth;

  Employee(){}

  public Employee(Long id, String name, String department) {
    this.id = id;
    this.name = name;
    this.department = department;
//    this.dateOfBirth = dateOfBirth;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", department='" + department + '\'' +
            '}';
  }
}
