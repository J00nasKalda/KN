package com.example.OrderManagement.domain.ordercustomer;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order-customer")
public class OrderCustomerController {

    @Resource
    private OrderCustomerService orderCustomerService;

    @GetMapping("/by-customer")
    @Operation(summary = "Get order ID by customer name")
    public OrderCustomerDto getByCustomerName(@RequestParam String customerName) {
        return orderCustomerService.getByCustomerName(customerName);
    }
}
