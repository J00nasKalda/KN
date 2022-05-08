package com.example.OrderManagement.domain.orderline;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderLineService {

    @Resource
    private OrderLineRepository orderLineRepository;

    @Resource
    private OrderLineMapper orderLineMapper;


    public OrderLineDto getByProductName(String productName) {
        OrderLine orderLine = orderLineRepository.findByProduct(productName);
        return orderLineMapper.orderLineToOrderLineDto(orderLine);
    }

}
