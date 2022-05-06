package com.example.OrderManagement.domain.orderline;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderLineMapper {
    @Mapping(source = "productId", target = "product.id")
    OrderLine orderLineDtoToOrderLine(OrderLineDto orderLineDto);

    @Mapping(source = "product.id", target = "productId")
    OrderLineDto orderLineToOrderLineDto(OrderLine orderLine);

    @Mapping(source = "productId", target = "product.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateOrderLineFromOrderLineDto(OrderLineDto orderLineDto, @MappingTarget OrderLine orderLine);
}
