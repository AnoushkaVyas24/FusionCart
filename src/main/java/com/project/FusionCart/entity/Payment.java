package com.project.FusionCart.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "payments")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne(mappedBy = "payment", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Order order;

    @NotBlank
    @Size(min = 4, message = "Payment method must contain atleast 4 characters")
    private String paymentMethod;

    public Payment(Long paymentId, Order order, String paymentMethod) {
        this.paymentId = paymentId;
        this.order = order;
        this.paymentMethod = paymentMethod;
    }

    public Payment() {
    }
}
