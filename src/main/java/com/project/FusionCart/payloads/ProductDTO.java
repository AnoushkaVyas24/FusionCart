package com.project.FusionCart.payloads;

import lombok.Data;

@Data
public class ProductDTO {
    private Long productId;
    private String productName;
    private String image;
    private String description;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;

    public ProductDTO() {
    }

    public ProductDTO(Long productId, String productName, String image, String description, Integer quantity, double price, double discount, double specialPrice) {
        this.productId = productId;
        this.productName = productName;
        this.image = image;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.specialPrice = specialPrice;
    }
}
