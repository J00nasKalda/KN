package com.example.OrderManagement.domain.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto implements Serializable {
    private Integer id;
    private String name;
    private String skuCode;
    private String unitPrice;
}
