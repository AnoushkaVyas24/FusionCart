package com.project.FusionCart.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NotBlank
    @Size(min = 3,message = "Product name must be aleast 3 characters long")
    private String productName;

    private String image;

    @NotBlank
    @Size(min = 6, message = "Product description must be atleast 6 characters long")
    private String description;

    private Integer quantity;
    private double price;
    private double discount;
    private double specialDiscount;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<CartItem> products = new ArrayList<>();

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<OrderItem> orderItems = new ArrayList<>();

    public Product(Long productId, String productName, String image, String description, Integer quantity, double price, double discount, double specialDiscount, Category category, List<CartItem> products, List<OrderItem> orderItems) {
        this.productId = productId;
        this.productName = productName;
        this.image = image;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.specialDiscount = specialDiscount;
        this.category = category;
        this.products = products;
        this.orderItems = orderItems;
    }

    public Product() {
    }
}
