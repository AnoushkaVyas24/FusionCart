package com.project.FusionCart.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts")
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cart", cascade ={CascadeType.PERSIST,CascadeType.MERGE},orphanRemoval = true)
    private List<CartItem> cartItems = new ArrayList<>();

    private Double totalPrice = 0.0;

    public Cart(Long cartId, User user, List<CartItem> cartItems, Double totalPrice) {
        this.cartId = cartId;
        this.user = user;
        this.cartItems = cartItems;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }
}
