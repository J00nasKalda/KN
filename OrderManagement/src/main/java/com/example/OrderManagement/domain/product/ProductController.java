package com.example.OrderManagement.domain.product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;


    @PostMapping("/new")

    public ProductDto addNewProduct(@Valid @RequestBody ProductDto productDto) {
        return productService.addNewProduct(productDto);
    }

}
