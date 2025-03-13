package com.project.FusionCart.payloads;

import lombok.Data;

@Data
public class OrderItem {
    private Long orderItemId;
    private ProductDTO product;
    private Integer quantity;
    private double discount;
    private double orderedProductPrice;

    public OrderItem() {
    }

    public OrderItem(Long orderItemId, ProductDTO product, Integer quantity, double discount, double orderedProductPrice) {
        this.orderItemId = orderItemId;
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.orderedProductPrice = orderedProductPrice;
    }
}
