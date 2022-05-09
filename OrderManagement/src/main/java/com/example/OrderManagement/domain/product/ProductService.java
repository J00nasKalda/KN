package com.example.OrderManagement.domain.product;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService {

    @Resource
    private ProductRepository productRepository;

    @Resource
    private ProductMapper productMapper;



    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.productToProductDtos(products);
    }

    public ProductDto getProductById(Integer productId) {
        Product product = productRepository.getById(productId);
        return productMapper.productToProductDto(product);
    }

    public ProductDto addNewProduct(ProductDto productDto) {
        Product product = productMapper.productDtoToProduct(productDto);
        productRepository.save(product);
        return productMapper.productToProductDto(product);

    }

    public void updateProductById(Integer productId, ProductDto productDto) {
        Product product = productRepository.getById(productId);
        productMapper.updateProductFromProductDto(productDto,product);
        productRepository.save(product);
    }

    public void deleteProductById(Integer productId) {
        productRepository.deleteById(productId);
    }
}
