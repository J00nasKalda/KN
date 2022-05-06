package com.example.OrderManagement.domain.orderline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order-line")
public class OrderLineController {

    @Resource
    private OrderLineService orderLineService;

}
