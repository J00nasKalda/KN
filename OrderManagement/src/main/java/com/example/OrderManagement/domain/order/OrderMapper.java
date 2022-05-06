package com.example.OrderManagement.domain.order;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderMapper {
    @Mapping(source = "orderLineId", target = "orderLine.id")
    @Mapping(source = "customerId", target = "customer.id")
    Order orderDtoToOrder(OrderDto orderDto);

    @InheritInverseConfiguration(name = "orderDtoToOrder")
    OrderDto orderToOrderDto(Order order);

    @InheritConfiguration(name = "orderDtoToOrder")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateOrderFromOrderDto(OrderDto orderDto, @MappingTarget Order order);
}
