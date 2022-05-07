package com.example.OrderManagement.domain.order;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderMapper {
    @Mapping(source = "customerId", target = "customer.id")
    Order orderDtoToOrder(OrderDto orderDto);

    @Mapping(source = "customer.id", target = "customerId")
    OrderDto orderToOrderDto(Order order);

    @Mapping(source = "customerId", target = "customer.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateOrderFromOrderDto(OrderDto orderDto, @MappingTarget Order order);
}
