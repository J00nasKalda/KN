package com.example.OrderManagement.domain.order;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "\"order\"")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date_of_submission", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfSubmission;

}