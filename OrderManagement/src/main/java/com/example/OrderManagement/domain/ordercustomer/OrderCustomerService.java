package com.example.OrderManagement.domain.ordercustomer;

import com.example.OrderManagement.domain.order.Order;
import com.example.OrderManagement.domain.order.OrderDto;
import com.example.OrderManagement.domain.order.OrderService;
import com.example.OrderManagement.domain.orderline.OrderLine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderCustomerService {

    @Resource
    private OrderCustomerRepository orderCustomerRepository;

    @Resource
    private OrderCustomerMapper orderCustomerMapper;

    @Resource
    private OrderService orderService;


    public OrderCustomerDto getByCustomerName(String customerName) {
        OrderCustomer orderCustomer = orderCustomerRepository.findByCustomer(customerName);
        return orderCustomerMapper.orderCustomerToOrderCustomerDto(orderCustomer);
    }

    public OrderCustomer addAndSave( Integer orderCustomerId) {
        OrderCustomer orderCustomer = orderCustomerRepository.getById(orderCustomerId);

        OrderCustomer orderCustomerResponse = new OrderCustomer();
        orderCustomerResponse.setCustomer(orderCustomer.getCustomer());
        orderCustomerResponse.setOrder(orderCustomer.getOrder());

        orderCustomerRepository.save(orderCustomerResponse);

        return orderCustomerResponse;
    }

    public List<OrderDto> findOrdersByCustomer(String customerName) {
        List<OrderCustomer> orderCustomers = orderCustomerRepository.findByCustomer_FullNameIgnoreCase(customerName);

        ArrayList<Order> orders = new ArrayList<>();
        for (OrderCustomer orderCustomer : orderCustomers) {
            orders.add(orderCustomer.getOrder());
        }

        return orderService.toDtos(orders);
    }
}
