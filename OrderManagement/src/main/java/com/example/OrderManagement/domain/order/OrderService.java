package com.example.OrderManagement.domain.order;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private OrderMapper orderMapper;

}
