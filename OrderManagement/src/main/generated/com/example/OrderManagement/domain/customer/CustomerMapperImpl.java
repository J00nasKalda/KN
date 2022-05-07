package com.example.OrderManagement.domain.customer;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-07T10:36:58+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Amazon.com Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerDto.getId() );
        customer.setRegistrationCode( customerDto.getRegistrationCode() );
        customer.setFullName( customerDto.getFullName() );
        customer.setEmail( customerDto.getEmail() );
        customer.setTelephone( customerDto.getTelephone() );

        return customer;
    }

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Integer id = null;
        String registrationCode = null;
        String fullName = null;
        String email = null;
        String telephone = null;

        id = customer.getId();
        registrationCode = customer.getRegistrationCode();
        fullName = customer.getFullName();
        email = customer.getEmail();
        telephone = customer.getTelephone();

        CustomerDto customerDto = new CustomerDto( id, registrationCode, fullName, email, telephone );

        return customerDto;
    }

    @Override
    public List<CustomerDto> customerToCustomerDtos(List<Customer> customer) {
        if ( customer == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( customer.size() );
        for ( Customer customer1 : customer ) {
            list.add( customerToCustomerDto( customer1 ) );
        }

        return list;
    }

    @Override
    public void updateCustomerFromCustomerDto(CustomerDto customerDto, Customer customer) {
        if ( customerDto == null ) {
            return;
        }

        if ( customerDto.getId() != null ) {
            customer.setId( customerDto.getId() );
        }
        if ( customerDto.getRegistrationCode() != null ) {
            customer.setRegistrationCode( customerDto.getRegistrationCode() );
        }
        if ( customerDto.getFullName() != null ) {
            customer.setFullName( customerDto.getFullName() );
        }
        if ( customerDto.getEmail() != null ) {
            customer.setEmail( customerDto.getEmail() );
        }
        if ( customerDto.getTelephone() != null ) {
            customer.setTelephone( customerDto.getTelephone() );
        }
    }
}
