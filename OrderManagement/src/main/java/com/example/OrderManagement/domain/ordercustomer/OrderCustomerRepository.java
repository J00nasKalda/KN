package com.example.OrderManagement.domain.ordercustomer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderCustomerRepository extends JpaRepository<OrderCustomer, Integer> {
    @Query("select o from OrderCustomer o where upper(o.customer.fullName) = upper(?1)")
    OrderCustomer findByCustomer(String fullName);

    @Query("select o from OrderCustomer o where o.customer.id = ?1")
    OrderCustomer findByCustomer_Id(Integer id);

    @Query("select o from OrderCustomer o where upper(o.customer.fullName) = upper(?1)")
    List<OrderCustomer> findByCustomer_FullNameIgnoreCase(String fullName);






}