package com.example.OrderManagement.service.neworder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewOrderResponse {

    public Integer customerId;
    public Integer productId;
    public Integer orderId;
    public Integer orderLineId;
    public Integer orderCustomerId;


}
