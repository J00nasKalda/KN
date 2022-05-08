package com.example.OrderManagement.domain.orderline;

import com.example.OrderManagement.domain.product.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-07T10:36:58+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Amazon.com Inc.)"
)
@Component
public class OrderLineMapperImpl implements OrderLineMapper {

    @Override
    public OrderLine orderLineDtoToOrderLine(OrderLineDto orderLineDto) {
        if ( orderLineDto == null ) {
            return null;
        }

        OrderLine orderLine = new OrderLine();

        orderLine.setProduct( orderLineDtoToProduct( orderLineDto ) );
        orderLine.setOrder( orderLineDtoToOrder( orderLineDto ) );
        orderLine.setId( orderLineDto.getId() );
        orderLine.setQuantity( orderLineDto.getQuantity() );

        return orderLine;
    }

    @Override
    public OrderLineDto orderLineToOrderLineDto(OrderLine orderLine) {
        if ( orderLine == null ) {
            return null;
        }

        Integer productId = null;
        Integer orderId = null;
        Integer id = null;
        Integer quantity = null;

        productId = orderLineProductId( orderLine );
        orderId = orderLineOrderId( orderLine );
        id = orderLine.getId();
        quantity = orderLine.getQuantity();

        OrderLineDto orderLineDto = new OrderLineDto( id, quantity, productId, orderId );

        return orderLineDto;
    }

    @Override
    public void updateOrderLineFromOrderLineDto(OrderLineDto orderLineDto, OrderLine orderLine) {
        if ( orderLineDto == null ) {
            return;
        }

        if ( orderLine.getProduct() == null ) {
            orderLine.setProduct( new Product() );
        }
        orderLineDtoToProduct1( orderLineDto, orderLine.getProduct() );
        if ( orderLine.getOrder() == null ) {
            orderLine.setOrder( new Order() );
        }
        orderLineDtoToOrder1( orderLineDto, orderLine.getOrder() );
        if ( orderLineDto.getId() != null ) {
            orderLine.setId( orderLineDto.getId() );
        }
        if ( orderLineDto.getQuantity() != null ) {
            orderLine.setQuantity( orderLineDto.getQuantity() );
        }
    }

    protected Product orderLineDtoToProduct(OrderLineDto orderLineDto) {
        if ( orderLineDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( orderLineDto.getProductId() );

        return product;
    }

    protected Order orderLineDtoToOrder(OrderLineDto orderLineDto) {
        if ( orderLineDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderLineDto.getOrderId() );

        return order;
    }

    private Integer orderLineProductId(OrderLine orderLine) {
        if ( orderLine == null ) {
            return null;
        }
        Product product = orderLine.getProduct();
        if ( product == null ) {
            return null;
        }
        Integer id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer orderLineOrderId(OrderLine orderLine) {
        if ( orderLine == null ) {
            return null;
        }
        Order order = orderLine.getOrder();
        if ( order == null ) {
            return null;
        }
        Integer id = order.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void orderLineDtoToProduct1(OrderLineDto orderLineDto, Product mappingTarget) {
        if ( orderLineDto == null ) {
            return;
        }

        if ( orderLineDto.getProductId() != null ) {
            mappingTarget.setId( orderLineDto.getProductId() );
        }
    }

    protected void orderLineDtoToOrder1(OrderLineDto orderLineDto, Order mappingTarget) {
        if ( orderLineDto == null ) {
            return;
        }

        if ( orderLineDto.getOrderId() != null ) {
            mappingTarget.setId( orderLineDto.getOrderId() );
        }
    }
}
