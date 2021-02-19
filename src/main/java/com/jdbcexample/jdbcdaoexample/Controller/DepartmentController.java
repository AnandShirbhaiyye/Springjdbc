package com.jdbcexample.jdbcdaoexample.Controller;

import com.jdbcexample.jdbcdaoexample.model.Department;
import com.jdbcexample.jdbcdaoexample.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/saveDapartment")
    public String addDepartment(@RequestBody Department department){
        return departmentRepository.insertDepartment(department);
    }
}
