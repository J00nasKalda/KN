package com.example.OrderManagement.service.newcustomer;

import com.example.OrderManagement.domain.customer.CustomerDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/new-customer")
public class NewCustomerController {

    @Resource
    private NewCustomerService newCustomerService;

    @PostMapping("/new")
    @Operation(summary = "Add new Customer")
    public CustomerDto addNewCustomer(@Valid @RequestBody CustomerDto customerDto) {
        return newCustomerService.addCustomer(customerDto);
    }
}
