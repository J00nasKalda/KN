package com.example.OrderManagement.domain.order;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "id", ignore = true)
    Order orderDtoToOrder(OrderDto orderDto);

    OrderDto orderToOrderDto(Order order);

    List<OrderDto> orderToOrderDtos(List<Order> order);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateOrderFromOrderDto(OrderDto orderDto, @MappingTarget Order order);
}
