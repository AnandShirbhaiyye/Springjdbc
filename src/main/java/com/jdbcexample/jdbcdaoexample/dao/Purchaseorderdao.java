package com.jdbcexample.jdbcdaoexample.dao;
import com.jdbcexample.jdbcdaoexample.model.Purchaseorder;
import com.jdbcexample.jdbcdaoexample.repository.PurchaseorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
@Component
public class Purchaseorderdao implements PurchaseorderRepository {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    @Override
    public String AddPurchaseOrder(Purchaseorder purchaseorder) {
        String sql="insert into purchaseorder values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{purchaseorder.getPoid(),purchaseorder.getCname()
                ,purchaseorder.getCaddress()});

        return "PurchaseOrder data added successfully...";

    }
}
