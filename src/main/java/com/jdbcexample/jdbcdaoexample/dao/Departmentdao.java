package com.jdbcexample.jdbcdaoexample.dao;

import com.jdbcexample.jdbcdaoexample.model.Department;
import com.jdbcexample.jdbcdaoexample.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class Departmentdao implements DepartmentRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String insertDepartment(Department department) {
        String sql="insert into department values(?,?)";
        jdbcTemplate.update(sql,new Object[]{department.getId(),department.getName()});
        return" Department added successfully";
    }
}
