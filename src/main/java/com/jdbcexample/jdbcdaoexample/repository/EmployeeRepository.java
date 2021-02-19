package com.jdbcexample.jdbcdaoexample.repository;

import com.jdbcexample.jdbcdaoexample.model.Empdept;
import com.jdbcexample.jdbcdaoexample.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {
  String saveEmployee(Employee employee);

   String saveEmployee(Empdept emdt);

   List<Map<String,Object>>getCombinedData();
}
