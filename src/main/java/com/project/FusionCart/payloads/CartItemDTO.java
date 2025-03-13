package com.project.FusionCart.payloads;

import lombok.Data;

@Data
public class CartItemDTO {
    private Long cartItemId;
    private CartDTO cart;
    private ProductDTO product;
    private Integer quantity;
    private double discount;
    private double productPrice;

    public CartItemDTO(Long cartItemId, CartDTO cart, ProductDTO product, Integer quantity, double discount, double productPrice) {
        this.cartItemId = cartItemId;
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.productPrice = productPrice;
    }

    public CartItemDTO() {
    }
}
