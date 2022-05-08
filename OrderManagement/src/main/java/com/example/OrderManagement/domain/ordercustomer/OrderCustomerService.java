package com.example.OrderManagement.domain.ordercustomer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderCustomerService {

    @Resource
    private OrderCustomerRepository orderCustomerRepository;

    @Resource
    private OrderCustomerMapper orderCustomerMapper;


    public OrderCustomerDto getByCustomerName(String customerName) {
        OrderCustomer orderCustomer = orderCustomerRepository.findByCustomer(customerName);
        return orderCustomerMapper.orderCustomerToOrderCustomerDto(orderCustomer);
    }
}
