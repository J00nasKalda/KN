package com.example.OrderManagement.domain.customer;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Resource
    CustomerMapper customerMapper;


    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customerMapper.customerToCustomerDtos(customers);

    }

    public CustomerDto getCustomerById(Integer customerId) {
        Customer customer = customerRepository.getById(customerId);
        return customerMapper.customerToCustomerDto(customer);
    }

    public CustomerDto addNewCustomer(CustomerDto customerDto) {
        Customer customer = customerMapper.customerDtoToCustomer(customerDto);
        customerRepository.save(customer);
        return customerMapper.customerToCustomerDto(customer);
    }

    public void updateCustomerById(Integer customerId, CustomerDto customerDto) {
        Customer customer = customerRepository.getById(customerId);
        customerMapper.updateCustomerFromCustomerDto(customerDto,customer);
        customerRepository.save(customer);
    }

    public void deleteCustomerById(Integer customerId) {
        Customer customer = customerRepository.getById(customerId);
        customerRepository.delete(customer);
    }
}
