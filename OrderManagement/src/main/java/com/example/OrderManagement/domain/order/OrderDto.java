package com.example.OrderManagement.domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto implements Serializable {
    private Integer id;
    private LocalDate dateOfSubmission;
    private Integer orderLineId;
    private Integer customerId;
}
