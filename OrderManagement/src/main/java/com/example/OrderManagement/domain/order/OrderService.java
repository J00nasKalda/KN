package com.example.OrderManagement.domain.order;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private OrderMapper orderMapper;

    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.orderToOrderDtos(orders);
    }

    public OrderDto getOrderById(Integer orderId) {
        Order order = orderRepository.getById(orderId);
        return orderMapper.orderToOrderDto(order);
    }

    public void addNewOrder(OrderDto orderDto) {
        Order order = orderMapper.orderDtoToOrder(orderDto);
        orderRepository.save(order);
    }

    public void updateOrderById(Integer orderId, OrderDto orderDto) {
        Order order = orderRepository.getById(orderId);
        orderMapper.updateOrderFromOrderDto(orderDto, order);
        orderRepository.save(order);
    }

    public void deleteOrderById(Integer orderId) {
        orderRepository.deleteById(orderId);
    }
}
