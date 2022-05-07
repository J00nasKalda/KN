package com.example.OrderManagement.domain.customer;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @GetMapping("/all")
    @Operation(summary = "gets a list of customers")
    public List<CustomerDto> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/id")
    @Operation(summary = "gets customber by id")
    public CustomerDto getCustomerById(@RequestParam Integer customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/new")
    @Operation(summary = "add new customer")
    public CustomerDto addNewCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.addNewCustomer(customerDto);
    }



}
