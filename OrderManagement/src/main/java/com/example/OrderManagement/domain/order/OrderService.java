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

//    public List<OrderDto> getAllOrders() {
//        List<Order> orders = orderRepository.findAll();
//        return orderMapper.toDtos(orders);
//    }
//
//    public OrderDto getOrderById(Integer orderId) {
//        Order order = orderRepository.getById(orderId);
//        return orderMapper.toDto(order);
//    }
//
//    public OrderDto addNewOrder(OrderDto orderDto) {
//        Order order = orderMapper.toEntity(orderDto);
//        orderRepository.save(order);
//        return orderMapper.toDto(order);
//    }
//
//    public void updateOrderById(Integer orderId, OrderDto orderDto) {
//        Order order = orderRepository.getById(orderId);
//        orderMapper.updateEntity(orderDto, order);
//        orderRepository.save(order);
//    }
//
//    public void deleteOrderById(Integer orderId) {
//        orderRepository.deleteById(orderId);
//    }
}
