package com.example.OrderManagement.domain.order;

import com.example.OrderManagement.domain.customer.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-07T10:36:58+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Amazon.com Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order orderDtoToOrder(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setCustomer( orderDtoToCustomer( orderDto ) );
        order.setId( orderDto.getId() );
        order.setDateOfSubmission( orderDto.getDateOfSubmission() );

        return order;
    }

    @Override
    public OrderDto orderToOrderDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setCustomerId( orderCustomerId( order ) );
        orderDto.setId( order.getId() );
        orderDto.setDateOfSubmission( order.getDateOfSubmission() );

        return orderDto;
    }

    @Override
    public void updateOrderFromOrderDto(OrderDto orderDto, Order order) {
        if ( orderDto == null ) {
            return;
        }

        if ( order.getCustomer() == null ) {
            order.setCustomer( new Customer() );
        }
        orderDtoToCustomer1( orderDto, order.getCustomer() );
        if ( orderDto.getId() != null ) {
            order.setId( orderDto.getId() );
        }
        if ( orderDto.getDateOfSubmission() != null ) {
            order.setDateOfSubmission( orderDto.getDateOfSubmission() );
        }
    }

    protected Customer orderDtoToCustomer(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( orderDto.getCustomerId() );

        return customer;
    }

    private Integer orderCustomerId(Order order) {
        if ( order == null ) {
            return null;
        }
        Customer customer = order.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Integer id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void orderDtoToCustomer1(OrderDto orderDto, Customer mappingTarget) {
        if ( orderDto == null ) {
            return;
        }

        if ( orderDto.getCustomerId() != null ) {
            mappingTarget.setId( orderDto.getCustomerId() );
        }
    }
}
