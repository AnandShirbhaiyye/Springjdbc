package com.jdbcexample.jdbcdaoexample.Controller;
import com.jdbcexample.jdbcdaoexample.dao.Employeedao;
import com.jdbcexample.jdbcdaoexample.model.Empdept;
import com.jdbcexample.jdbcdaoexample.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@Component
public class EmployeeController {

    @Autowired
    private Employeedao employeedao;

    @PostMapping("/getemp")
    public String saveEmployee(@RequestBody Employee employee) {
        return employeedao.saveEmployee(employee);
    }

       @GetMapping("/displayemplo")
        public List<Employee> displayEmployee(){
            return employeedao.findAll();
        }

    @PostMapping("/getemployee")
    public String saveEmployee(@RequestBody Empdept emdt) { // @requestbody=to get data as a object
        return employeedao.saveEmployee(emdt);
    }


    //joining of data
   @GetMapping("/joindata")
    public  List<Map<String,Object>>getJoinData(){
        return  employeedao.getCombinedData();
    }

}



