package com.example.OrderManagement.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("select o from Order o where o.dateOfSubmission = ?1")
    List<Order> findByDateOfSubmission(LocalDate dateOfSubmission);

//    @Query("select o from Order o where o.dateOfSubmission = ?1")
//    Order findByDateOfSubmission(LocalDate dateOfSubmission);





}