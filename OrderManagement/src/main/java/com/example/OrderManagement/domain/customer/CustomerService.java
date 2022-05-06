package com.example.OrderManagement.domain.customer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Resource
    CustomerMapper customerMapper;


}
