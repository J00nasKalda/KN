package com.example.OrderManagement.domain.orderline;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderLineDto implements Serializable {
    private final Integer id;
    private final Integer quantity;
    private final Integer productId;
    private final Integer orderId;
}
