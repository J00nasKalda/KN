package com.example.OrderManagement.service.newproduct;

import com.example.OrderManagement.domain.order.OrderService;
import com.example.OrderManagement.domain.product.ProductDto;
import com.example.OrderManagement.domain.product.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NewProductService {

    @Resource
    private ProductService productService;

    public ProductDto addProduct(ProductDto productDto) {
        return productService.addNewProduct(productDto);
    }
}
