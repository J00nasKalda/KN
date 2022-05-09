package com.example.OrderManagement.domain.order;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
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

    public OrderDto addNewOrder(OrderDto orderDto) {
        Order order = orderMapper.orderDtoToOrder(orderDto);
        orderRepository.save(order);
        return orderMapper.orderToOrderDto(order);
    }

    public Order addNewOrderandGetEntity(OrderDto orderDto) {
        Order order = orderMapper.orderDtoToOrder(orderDto);
        orderRepository.save(order);
        return order;
    }

    public void updateOrderById(Integer orderId, OrderDto orderDto) {
        Order order = orderRepository.getById(orderId);
        orderMapper.updateOrderFromOrderDto(orderDto, order);
        orderRepository.save(order);
    }

    public void deleteOrderById(Integer orderId) {
        orderRepository.deleteById(orderId);
    }

    public List<OrderDto> getBydate(LocalDate orderDate) {
        List<Order> orders = orderRepository.findByDateOfSubmission(orderDate);
        return orderMapper.orderToOrderDtos(orders);
    }

    public List<OrderDto> toDtos(ArrayList<Order> orders) {
        return orderMapper.orderToOrderDtos(orders);
    }
}
