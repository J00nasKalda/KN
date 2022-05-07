package com.example.OrderManagement.domain.orderline;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderLineMapper {
    @Mapping(source = "productId", target = "product.id")
    @Mapping(source = "orderId", target = "order.id")
    OrderLine orderLineDtoToOrderLine(OrderLineDto orderLineDto);

    @InheritInverseConfiguration(name = "orderLineDtoToOrderLine")
    OrderLineDto orderLineToOrderLineDto(OrderLine orderLine);

    @InheritConfiguration(name = "orderLineDtoToOrderLine")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateOrderLineFromOrderLineDto(OrderLineDto orderLineDto, @MappingTarget OrderLine orderLine);
}
