package com.example.OrderManagement.service.newcustomer;

import com.example.OrderManagement.domain.customer.CustomerDto;
import com.example.OrderManagement.domain.customer.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NewCustomerService {

    @Resource
    private CustomerService customerService;


    public CustomerDto addCustomer(CustomerDto customerDto) {
        return customerService.addNewCustomer(customerDto);
    }
}
