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
    @NotNull
    private String registrationCode;
    @NotNull
    private String fullName;
    @NotNull
    private String email;
    @NotNull
    private String telephone;
}
