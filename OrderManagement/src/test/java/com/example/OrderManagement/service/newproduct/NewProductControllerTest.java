package com.example.OrderManagement.service.newproduct;

import com.example.OrderManagement.domain.customer.CustomerDto;
import com.example.OrderManagement.domain.product.ProductDto;
import com.example.OrderManagement.service.newcustomer.NewCustomerController;
import com.example.OrderManagement.service.newcustomer.NewCustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(NewProductController.class)
class NewProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private NewProductService newProductService;

    @Test
    void addNewCustomer() throws Exception {
        ProductDto productDto = new ProductDto();

        productDto.setId(1);
        productDto.setName("Coal");
        productDto.setSkuCode("88888");
        productDto.setUnitPrice("4545.44");


        when(newProductService.addProduct(any(ProductDto.class))).thenReturn(productDto);

        mockMvc.perform(MockMvcRequestBuilders.post("/new-product/new")
                        .content(new ObjectMapper().writeValueAsString(productDto))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Coal"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.skuCode").value("88888"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.unitPrice").value("4545.44"));


    }
}