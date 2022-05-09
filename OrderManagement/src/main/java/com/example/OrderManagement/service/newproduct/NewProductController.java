package com.example.OrderManagement.service.newproduct;

import com.example.OrderManagement.domain.customer.CustomerDto;
import com.example.OrderManagement.domain.product.ProductDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/new-product")
public class NewProductController {

    @Resource
    private NewProductService newProductService;

    @PostMapping("/new")
    @Operation(summary = "Add new product")
    public ProductDto addNewCustomer(@Valid @RequestBody ProductDto productDto) {
        return newProductService.addProduct(productDto);
    }

}
