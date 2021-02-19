package com.jdbcexample.jdbcdaoexample.dao;

import com.jdbcexample.jdbcdaoexample.model.Empdept;
import com.jdbcexample.jdbcdaoexample.model.Employee;
import com.jdbcexample.jdbcdaoexample.repository.EmployeeRepository;
import com.sun.deploy.security.JarSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Employeedao implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String saveEmployee(Employee employee) {
        String sql="insert into employee values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{employee.getId(),employee.getName(),employee.getCity()});
        return " Employee data added successfully...";
    }

  /* @Override
   public String saveEmployee(Employee employee) {
       String sql="Insert into employee values(?,?,?,?)";
       jdbcTemplate.update(sql,new Object[]{employee.getId(),employee.getName(),employee.getCity(),
               employee.getDepartment().getId()});
       return "Employee added successfully";
   }*/


   //Retrive data from multiple table
   @Override
    public String saveEmployee(Empdept emdt) {
       String sql="Insert into empdept values(?,?,?,?)";
       jdbcTemplate.update(sql,new Object[]{emdt.getId(),emdt.getName(),emdt.getCity(),
               emdt.getDepartment().getId()});
        return " EmpDept added successfully....";
    }

     //joining of data
    @Override
    public List<Map<String, Object>> getCombinedData() {
       String sql="select a.id,a.name,a.city,b.name from empdept a,department b"
               +" where a.dept_id=b.id";
       List<Map<String,Object>>list=jdbcTemplate.queryForList(sql);
        return list ;
    }

   //findallemployees
    public List<Employee>findAll(){
        String sql="select * from employee";
    List<Employee>list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Employee.class));
    return list;
    }
}

