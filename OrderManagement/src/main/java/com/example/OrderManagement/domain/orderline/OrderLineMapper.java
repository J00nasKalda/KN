package com.example.OrderManagement.domain.orderline;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderLineMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "productId", target = "product.id")
    @Mapping(source = "orderId", target = "order.id")
    OrderLine orderLineDtoToOrderLine(OrderLineDto orderLineDto);

    @InheritInverseConfiguration(name = "orderLineDtoToOrderLine")
    OrderLineDto orderLineToOrderLineDto(OrderLine orderLine);

    List<OrderLineDto> orderLineToOrderLineDtos(List<OrderLine> orderLine);

    @InheritConfiguration(name = "orderLineDtoToOrderLine")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateOrderLineFromOrderLineDto(OrderLineDto orderLineDto, @MappingTarget OrderLine orderLine);
}
