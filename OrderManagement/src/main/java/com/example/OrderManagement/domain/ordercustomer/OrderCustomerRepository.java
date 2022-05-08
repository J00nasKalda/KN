package com.example.OrderManagement.domain.ordercustomer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderCustomerRepository extends JpaRepository<OrderCustomer, Integer> {
    @Query("select o from OrderCustomer o where upper(o.customer.fullName) = upper(?1)")
    OrderCustomer findByCustomer(String fullName);


}