package com.example.OrderManagement.domain.orderline;

import com.example.OrderManagement.domain.order.Order;
import com.example.OrderManagement.domain.order.OrderDto;
import com.example.OrderManagement.domain.order.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderLineService {

    @Resource
    private OrderLineRepository orderLineRepository;

    @Resource
    private OrderLineMapper orderLineMapper;

    @Resource
    private OrderService orderService;


    public OrderLineDto getByProductName(String productName) {
        OrderLine orderLine = orderLineRepository.findByProduct(productName);
        return orderLineMapper.orderLineToOrderLineDto(orderLine);
    }

    public OrderLine addAndSAve(Integer orderQuantity, Integer orderLineId) {
        OrderLine orderLine = orderLineRepository.getById(orderLineId);

        OrderLine orderLineResponse = new OrderLine();
        orderLineResponse.setOrder(orderLine.getOrder());
        orderLineResponse.setProduct(orderLine.getProduct());
        orderLineResponse.setQuantity(orderQuantity);

        orderLineRepository.save(orderLineResponse);

        return orderLineResponse;
    }

    public List<OrderDto> findOrdersByProduct(String product) {
        List<OrderLine> orderlines = orderLineRepository.findByProduct_NameIgnoreCase(product);

        ArrayList<Order> orders = new ArrayList<>();
        for (OrderLine orderline : orderlines) {
            orders.add(orderline.getOrder());
        }

        return orderService.toDtos(orders);
    }
}
