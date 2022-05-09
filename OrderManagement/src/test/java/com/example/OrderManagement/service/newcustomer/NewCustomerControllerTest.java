package com.example.OrderManagement.service.newcustomer;

import com.example.OrderManagement.domain.customer.CustomerDto;
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

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(NewCustomerController.class)
class NewCustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private NewCustomerService newCustomerService;

    @Test
    void addNewCustomer() throws Exception {

        CustomerDto customerDto = new CustomerDto();

        customerDto.setId(1);
        customerDto.setEmail("joe@rogan.ee");
        customerDto.setFullName("Joe Rogan");
        customerDto.setTelephone("+57 57575757575");
        customerDto.setRegistrationCode("55555");

        when(newCustomerService.addCustomer(any(CustomerDto.class))).thenReturn(customerDto);

        mockMvc.perform(MockMvcRequestBuilders.post("/new-customer/new")
                        .content(new ObjectMapper().writeValueAsString(customerDto))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("joe@rogan.ee"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.fullName").value("Joe Rogan"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.telephone").value("+57 57575757575"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.registrationCode").value("55555"));
    }
}