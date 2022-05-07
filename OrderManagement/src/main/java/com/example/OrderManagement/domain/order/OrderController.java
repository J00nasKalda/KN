package com.example.OrderManagement.domain.order;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;


//    @GetMapping("/all")
//    @Operation(summary = "Get a list of all orders")
//    public List<OrderDto> getAllOrders() {
//        return orderService.getAllOrders();
//    }
//
//    @GetMapping("/id")
//    @Operation(summary = "Get order by order ID")
//    public OrderDto getOrderById(@RequestParam Integer orderId) {
//        return orderService.getOrderById(orderId);
//    }
//
//    @PostMapping("/new")
//    @Operation(summary = "Add new order")
//    public OrderDto addNewOrder(@Valid @RequestBody OrderDto orderDto) {
//        return orderService.addNewOrder(orderDto);
//    }
//
//    @PutMapping("/update")
//    @Operation(summary = "Update order by order ID")
//    public void updateOrderById(@RequestParam Integer orderId, @Valid @RequestBody OrderDto orderDto) {
//        orderService.updateOrderById(orderId, orderDto);
//    }
//
//    @DeleteMapping("/delete")
//    @Operation(summary = "Delete order by order ID")
//    public void deleteOrderById(Integer orderId) {
//        orderService.deleteOrderById(orderId);
//    }

}
