package com.example.OrderManagement.domain.orderline;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order-line")
public class OrderLineController {

    @Resource
    private OrderLineService orderLineService;

    @GetMapping("/by-product")
    @Operation(summary = "Get order ID by product name")
    public OrderLineDto getByProductName(@RequestParam String productName) {
        return orderLineService.getByProductName(productName);
    }


}
