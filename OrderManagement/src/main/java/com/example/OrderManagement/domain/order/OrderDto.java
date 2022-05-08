package com.example.OrderManagement.domain.order;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class OrderDto implements Serializable {
    private final Integer id;
    private final LocalDate dateOfSubmission;
}
