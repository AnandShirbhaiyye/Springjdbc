package com.jdbcexample.jdbcdaoexample.Controller;
import com.jdbcexample.jdbcdaoexample.dao.Purchaseorderdao;
import com.jdbcexample.jdbcdaoexample.model.Purchaseorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseorderController {

    @Autowired
    private Purchaseorderdao purchaseorderdao;

    @PostMapping("/Purchase")
    public String AddPurchaseOrder(@RequestBody Purchaseorder purchaseorder){
        return purchaseorderdao.AddPurchaseOrder(purchaseorder);
    }
}
