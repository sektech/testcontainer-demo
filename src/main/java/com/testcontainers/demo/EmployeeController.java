package com.testcontainers.demo;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {

  private final EmployeeRepository repo;

  EmployeeController(EmployeeRepository repo) {
    this.repo = repo;
  }

  @GetMapping("/api/employees")
  List<Employee> getAll() {
    return repo.findAll();
  }
}
