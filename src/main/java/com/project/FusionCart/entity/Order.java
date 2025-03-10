package com.project.FusionCart.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.hibernate.validator.internal.constraintvalidators.bv.time.past.PastValidatorForYearMonth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Email
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "order", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDate orderDate;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    private Double totalAmount;
    private String orderStatus;

    public Order(Long orderId, String email, List<OrderItem> orderItems, LocalDate orderDate, Payment payment, Double totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.email = email;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.payment = payment;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public Order() {
    }
}
