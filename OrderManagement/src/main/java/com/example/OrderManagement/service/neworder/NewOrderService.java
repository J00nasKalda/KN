package com.example.OrderManagement.service.neworder;

import com.example.OrderManagement.domain.order.Order;
import com.example.OrderManagement.domain.order.OrderDto;
import com.example.OrderManagement.domain.order.OrderService;
import com.example.OrderManagement.domain.ordercustomer.OrderCustomer;
import com.example.OrderManagement.domain.ordercustomer.OrderCustomerService;
import com.example.OrderManagement.domain.orderline.OrderLine;
import com.example.OrderManagement.domain.orderline.OrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class NewOrderService {

    @Resource
    private OrderService orderService;

    @Resource
    private OrderLineService orderLineService;

    @Resource
    private OrderCustomerService orderCustomerService;



    public NewOrderResponse addNewOrder(Integer orderCustomerId, Integer orderQuantity, Integer orderLineId, OrderDto orderDto) {
        Order order = orderService.addNewOrderandGetEntity(orderDto);
        OrderCustomer orderCustomer = orderCustomerService.addAndSave(orderCustomerId);
        OrderLine orderLine = orderLineService.addAndSAve(orderQuantity, orderLineId);


        NewOrderResponse newOrderResponse = new NewOrderResponse();
        newOrderResponse.setOrderId(order.getId());
        newOrderResponse.setOrderCustomerId(orderCustomer.getId());
        newOrderResponse.setCustomerId(orderCustomer.getCustomer().getId());
        newOrderResponse.setOrderLineId(orderLine.getId());
        newOrderResponse.setProductId(orderLine.getProduct().getId());

        return newOrderResponse;
    }

    public List<OrderDto> getByDate(LocalDate orderDate) {
        return orderService.getBydate(orderDate);
    }

    public List<OrderDto> getByProduct(String product) {
        return orderLineService.findOrdersByProduct(product);
    }

    public List<OrderDto> getByCustomer(String customerName) {
        return orderCustomerService.findOrdersByCustomer(customerName);
    }
}
