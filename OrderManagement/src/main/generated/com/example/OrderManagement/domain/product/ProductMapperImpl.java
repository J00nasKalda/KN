package com.example.OrderManagement.domain.product;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-07T10:36:58+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productDtoToProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDto.getId() );
        product.setName( productDto.getName() );
        product.setSkuCode( productDto.getSkuCode() );
        product.setUnitPrice( productDto.getUnitPrice() );

        return product;
    }

    @Override
    public ProductDto productToProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( product.getId() );
        productDto.setName( product.getName() );
        productDto.setSkuCode( product.getSkuCode() );
        productDto.setUnitPrice( product.getUnitPrice() );

        return productDto;
    }

    @Override
    public void updateProductFromProductDto(ProductDto productDto, Product product) {
        if ( productDto == null ) {
            return;
        }

        if ( productDto.getId() != null ) {
            product.setId( productDto.getId() );
        }
        if ( productDto.getName() != null ) {
            product.setName( productDto.getName() );
        }
        if ( productDto.getSkuCode() != null ) {
            product.setSkuCode( productDto.getSkuCode() );
        }
        if ( productDto.getUnitPrice() != null ) {
            product.setUnitPrice( productDto.getUnitPrice() );
        }
    }
}
