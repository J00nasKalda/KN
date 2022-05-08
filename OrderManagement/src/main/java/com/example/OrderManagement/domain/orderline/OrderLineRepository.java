package com.example.OrderManagement.domain.orderline;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {
    @Query("select o from OrderLine o where upper(o.product.name) = upper(?1)")
    OrderLine findByProduct(String name);






}