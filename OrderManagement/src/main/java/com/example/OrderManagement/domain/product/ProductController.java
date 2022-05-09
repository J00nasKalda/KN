package com.example.OrderManagement.domain.product;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;


//    @GetMapping("/all")
//    @Operation(summary = "Get list of products")
//    public List<ProductDto> getAllProducts() {
//        return productService.getAllProducts();
//    }
//
//    @GetMapping("/id")
//    @Operation(summary = "Get product by ID")
//    public ProductDto getAllProducts(@RequestParam Integer productId) {
//        return productService.getProductById(productId);
//    }
//
//    @PostMapping("/new")
//    @Operation(summary = "Add new product")
//    public void addNewProduct(@Valid @RequestBody ProductDto productDto) {
//        productService.addNewProduct(productDto);
//    }
//
//    @PutMapping("/update-id")
//    @Operation(summary = "Update prduct by ID")
//    public void updateProductById(@RequestParam Integer productId, @Valid @RequestBody ProductDto productDto) {
//        productService.updateProductById(productId, productDto);
//    }
//
//    @DeleteMapping("/delete-id")
//    @Operation(summary = "Delete product by ID")
//    public void deleteProductById(@RequestParam Integer productId) {
//        productService.deleteProductById(productId);
//    }

}
