package com.example.OrderManagement.domain.orderline;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {
    @Query("select o from OrderLine o where upper(o.product.name) = upper(?1)")
    OrderLine findByProduct(String name);

    @Query("select o from OrderLine o where o.product.id = ?1")
    OrderLine findByProduct_Id(Integer id);

    @Query("select o from OrderLine o where upper(o.product.name) = upper(?1)")
    List<OrderLine> findByProduct_NameIgnoreCase(String name);











}