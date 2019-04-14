package com.wyl.controller;

import com.wyl.model.Customer;
import com.wyl.service.CustomerService;
import org.smart4j.framework.Bean.Param;
import org.smart4j.framework.Bean.View;
import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Inject;


import java.util.List;

@Controller
public class TestController {

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList",customerList);
    }
}
