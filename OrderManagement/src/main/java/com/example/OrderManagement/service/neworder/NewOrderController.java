package com.example.OrderManagement.service.neworder;

import com.example.OrderManagement.domain.order.OrderDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/make-order")
public class NewOrderController {

    @Resource
    private NewOrderService newOrderService;

    @PostMapping("/new-all")
    @Operation(summary = "Add new order and connect it with product and customer")
    public NewOrderResponse addNewOrder(@RequestParam Integer orderCustomerId, @RequestParam Integer orderQuantity, @RequestParam Integer orderLineId, @Valid @RequestBody OrderDto orderDto) {
        return newOrderService.addNewOrder(orderCustomerId, orderQuantity,orderLineId, orderDto);
    }

    @PostMapping("/new")
    @Operation(summary = "Add new order")
    public OrderDto addOnlyOrder(@Valid @RequestBody OrderDto orderDto) {
        return newOrderService.addOnlyOrder(orderDto);
    }

    @GetMapping("/date")
    @Operation(summary = "Find orders by date")
    public List<OrderDto> getByDate(@RequestParam LocalDate orderDate) {
        return newOrderService.getByDate(orderDate);
    }

    @GetMapping("/product")
    @Operation(summary = "Find orders by product")
    public List<OrderDto> getByProduct(@RequestParam String product) {
        return newOrderService.getByProduct(product);
    }

    @GetMapping("/customer")
    @Operation(summary = "Find orders by customer")
    public List<OrderDto> getByCustomer(@RequestParam String customerName) {
        return newOrderService.getByCustomer(customerName);
    }

}
