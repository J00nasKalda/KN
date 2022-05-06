package com.example.OrderManagement.domain.product;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductService {

    @Resource
    private ProductRepository productRepository;

    @Resource
    private ProductMapper productMapper;

}
