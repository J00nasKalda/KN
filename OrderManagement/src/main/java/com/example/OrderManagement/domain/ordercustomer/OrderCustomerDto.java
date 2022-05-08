package com.example.OrderManagement.domain.ordercustomer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCustomerDto implements Serializable {
    private Integer id;
    private Integer orderId;
    private Integer customerId;
}
