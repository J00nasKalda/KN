package com.example.OrderManagement.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto implements Serializable {
    private Integer id;

    private String registrationCode;

    private String fullName;

    private String email;

    private String telephone;
}
