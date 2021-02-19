package com.jdbcexample.jdbcdaoexample.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
public class Poitemsdao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
