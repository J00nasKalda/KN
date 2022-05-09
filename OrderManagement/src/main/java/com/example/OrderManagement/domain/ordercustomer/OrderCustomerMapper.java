package com.example.OrderManagement.domain.ordercustomer;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderCustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "orderId", target = "order.id")
    @Mapping(source = "customerId", target = "customer.id")
    OrderCustomer orderCustomerDtoToOrderCustomer(OrderCustomerDto orderCustomerDto);

    @InheritInverseConfiguration(name = "orderCustomerDtoToOrderCustomer")
    OrderCustomerDto orderCustomerToOrderCustomerDto(OrderCustomer orderCustomer);

    @InheritConfiguration(name = "orderCustomerDtoToOrderCustomer")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateOrderCustomerFromOrderCustomerDto(OrderCustomerDto orderCustomerDto, @MappingTarget OrderCustomer orderCustomer);
}
