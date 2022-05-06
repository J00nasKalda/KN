package com.example.OrderManagement.domain.orderline;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineDto implements Serializable {
    private Integer id;
    private Integer quantity;
    private Integer productId;
}
